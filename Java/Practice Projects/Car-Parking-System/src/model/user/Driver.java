package model.user;

import utils.Utility;

public class Driver {
    private final String driverId;
    private final String name;
    private final String carId;

    public Driver(String name, String carId) {
        this.driverId = Utility.autoGenerateId();
        this.name= name;
        this.carId = carId;
    }

    public String getDriverId(){return driverId;}
    public String getName () {return name;}
    public String carId() {return carId;}
}
