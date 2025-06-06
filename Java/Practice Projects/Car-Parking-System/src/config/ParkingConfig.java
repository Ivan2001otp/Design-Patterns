package config;


import model.floor.InfraFloor;
import model.user.Admin;

public class ParkingConfig {

    public static Admin loadDefaultParkingStructure() {
        Admin admin = new Admin();

        InfraFloor floor1 = new InfraFloor(1, 50, true, true);
        InfraFloor floor2 = new InfraFloor(2, 30, false, true);
        InfraFloor floor3 = new InfraFloor(3, 20, true, false);
        InfraFloor floor4 = new InfraFloor(4, 25, false, false);

        admin.addFloor(floor1);
        admin.addFloor(floor2);
        admin.addFloor(floor3);
        admin.addFloor(floor4);

        return admin;
    }
}
