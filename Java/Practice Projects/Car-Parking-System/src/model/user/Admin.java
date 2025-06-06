package model.user;

import model.floor.InfraFloor;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<InfraFloor> floors;

    public Admin() {
        this.floors = new ArrayList<>();
    }

    public void addFloor(InfraFloor floor){
        floors.add(floor);
    }

    public void blockFloor(int floorNumber) {
        floors.stream().filter(f -> f.getFloorNumber() == floorNumber)
                .findFirst()
                .ifPresent(InfraFloor::blockFloorForMaintainence);

        System.out.println("Blocked the floor - "+floorNumber+" successfully !");
    }

    public void unblockFloor(int floorNumber) {
        floors.stream()
                .filter(f -> f.getFloorNumber() == floorNumber)
                .findFirst()
                .ifPresent(InfraFloor::unblockFloor);

        System.out.println("UnBlock the floor - "+floorNumber+" successfully !");

    }

    public List<InfraFloor> getFloors() {
        return floors;
    }

    public void showAllFloors() {
        System.out.println("=== Current Floor Info ===");
        for (InfraFloor floor : floors) {
            System.out.println(floor);
        }
    }

}
