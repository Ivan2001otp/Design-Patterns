package model.floor;

public class InfraFloor {
    private int floorNumber;
    private int maxParkingSlots;

    private int parkedSpaces;
    private boolean isBlockedForMaintainence;
    private boolean isAirPumpAvailable;
    private boolean isEVpointAvailable;

    public InfraFloor(int floorNumber, int maxParkingSlots, boolean isAirPumpAvailable, boolean isEVpointAvailable)  {
        this.isAirPumpAvailable = isAirPumpAvailable;
        this.isEVpointAvailable = isEVpointAvailable;
        this.floorNumber = floorNumber;
        this.maxParkingSlots = maxParkingSlots;
        this.isBlockedForMaintainence = false;
        this.parkedSpaces = 0;
    }

    public int getFloorNumber(){
        return floorNumber;
    }

    public void blockFloorForMaintainence() {
        System.out.println("Floor - "+floorNumber+" is blocked for maintainence. Kindly cooperate .");
        this.isBlockedForMaintainence = true;
    }

    public void unblockFloor() {
        System.out.println("Floor - "+floorNumber+" is blocked for maintainence. Kindly cooperate .");
        this.isBlockedForMaintainence = false;
    }


    public boolean hasEVPoint() {
        return this.isEVpointAvailable;
    }

    public boolean hasAirPumpPoint() {
        return this.isAirPumpAvailable;
    }

    public int getCurrentParked() {
        return this.parkedSpaces;
    }

    public boolean hasVacancy() {
        if (!isBlockedForMaintainence && maxParkingSlots-parkedSpaces > 0) {
            return true;
        }
        return false;
    }




    public void parkOne() {

        if (hasVacancy()) {
            System.out.println("A vehicle is parked in floor - "+floorNumber);
            this.parkedSpaces++;
        } else {
            System.out.println("No vacant slots in floor - "+floorNumber);
        }
    }

    public void unParkOne() {
        System.out.println("Unparking a vehicle in floor - "+floorNumber);
        if(parkedSpaces > 0) this.parkedSpaces--;
    }
}
