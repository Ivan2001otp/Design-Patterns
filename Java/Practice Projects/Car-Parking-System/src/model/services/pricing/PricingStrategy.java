package model.services.pricing;

import model.car.CarType;
import model.parking.ParkingType;

public interface PricingStrategy {
    float calculateFee(float durationInHours,
                       ParkingType parkingType,
                        CarType carType);
}
