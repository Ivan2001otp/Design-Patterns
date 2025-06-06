package model.services.manager;

import model.car.Car;
import model.car.CarType;
import model.floor.InfraFloor;
import model.parking.ParkingExpense;
import model.parking.ParkingType;
import model.payment.PaymentStatus;
import model.payment.PaymentType;
import model.services.pricing.HourlyPricingStrategy;
import model.services.pricing.PricingStrategy;
import model.user.Driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotManager {
    private static ParkingLotManager INSTANCE;
    private PricingStrategy pricingStrategy; // <- strategy pattern

    private final List<InfraFloor> floors = new ArrayList<>();
    private final Map<String, Car> parkedCars = new HashMap<>();
    private final Map<String, ParkingExpense> expenseMap = new HashMap<>();

    private ParkingLotManager() {}// <- private constructor


    // called by admin
    public void configureFloors(List<InfraFloor> floorList){
        floors.clear();
        floors.addAll(floorList);
    }

    // instance provider (singleton)
    public static ParkingLotManager getInstance() {
        if (INSTANCE== null) {
            synchronized (ParkingLotManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ParkingLotManager();

                }
            }
        }

        return INSTANCE;
    }

    public ParkingExpense unparkCar(String carId, int durationInHours, PaymentType paymentType, String driverId) {

        Car car = parkedCars.remove(carId);

        if (car==null) {
            System.out.println("Car not found !");
            return null;
        }

        // calculating fee by pricing strategy
        ParkingType parkingType = durationInHours >= 24 ? ParkingType.DAY : ParkingType.HOURLY;
        float amount = pricingStrategy.calculateFee(durationInHours, parkingType , car.getCarType());

        ParkingExpense expense = new ParkingExpense(parkingType, durationInHours, amount, driverId, paymentType);
        expenseMap.put(carId, expense);

        // reduce the park count
        for (InfraFloor currFloor : floors) {
            if (currFloor.getCurrentParked() > 0) {
                currFloor.unParkOne();
                break;
            }
        }

        System.out.println("Car unparked . Amount due : $"+amount);
        return expense;
    }


    // Car enters..
    public boolean parkCar(Car car, Driver driver) {
        for (InfraFloor currentFloor : floors) {

            if (currentFloor.hasVacancy()) {
                currentFloor.parkOne();
                parkedCars.put(car.getCardId(), car);

                System.out.println("Car parked at floor " + currentFloor.getFloorNumber());
                return true;
            }
        }

        System.out.println("No available slots in any floor. Please find somewhere to park !");
        return false;
    }

    public void setPricingStrategy (PricingStrategy pricingStrategy ){
        this.pricingStrategy = pricingStrategy;
    }

}
