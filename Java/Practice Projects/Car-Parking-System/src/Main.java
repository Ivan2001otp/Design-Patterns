import config.ParkingConfig;
import model.user.Admin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Admin admin = ParkingConfig.loadDefaultParkingStructure();
        admin.showAllFloors();

        /*
        * System.out.println("\nBlocking Floor 2...");
        admin.blockFloor(2);
        admin.showAllFloors();
        * */
    }
}

/*Folder structure
*  com/
└── parkinglot/
    ├── Main.java
    ├── config/
    │   └── ConfigLoader.java
    ├── model/
    │   ├── car/
    │   │   ├── Car.java
    │   │   ├── Sedan.java
    │   │   └── SUV.java
    │   ├── floor/
    │   │   ├── InfraFloor.java
    │   │   └── FloorBuilder.java
    │   ├── user/
    │   │   ├── Driver.java
    │   │   └── Admin.java
    │   ├── parking/
    │   │   ├── ParkingSlot.java
    │   │   └── SlotType.java
    │   └── payment/
    │       ├── ParkingExpense.java
    │       ├── PaymentStatus.java
    │       └── PaymentType.java
    ├── manager/
    │   ├── ParkingLotManager.java  ← Singleton
    │   ├── SlotAllocator.java
    │   └── NotificationManager.java
    ├── pricing/
    │   ├── PricingStrategy.java   ← Interface
    │   ├── HourlyPricing.java
    │   └── DailyPricing.java
    ├── factory/
    │   ├── CarFactory.java
    │   └── SlotFactory.java
    ├── observer/
    │   ├── Subject.java
    │   ├── Observer.java
    │   ├── FloorDisplay.java
    │   └── EntryGateDisplay.java
    ├── decorator/
    │   ├── CarDecorator.java
    │   ├── AirPumpDecorator.java
    │   └── EVChargeDecorator.java
    ├── command/
    │   ├── Command.java
    │   ├── BlockFloorCommand.java
    │   ├── UnblockFloorCommand.java
    │   └── AdminInvoker.java
    ├── facade/
    │   └── ParkingFacade.java
    └── util/
        └── RandomUtils.java

* */

/*
* 🔧 Possible Next Steps:
Start Coding the Core Classes (Java or Go?)

We can begin with Car, Driver, InfraFloor, and build relationships.

Model the Parking Flow

Flow for entering → finding a slot → parking → payment → exiting.

Build a Parking Manager / Controller

Central logic to manage slot allocation, vacancy tracking, payments.

Integrate Pricing Strategy

Use Strategy pattern to implement hourly vs daily pricing logic.

Simulation / CLI Demo

Optional: Build a CLI-based simulation of the flow
* */