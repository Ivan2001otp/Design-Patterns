package model.services.pricing;

import model.car.CarType;
import model.parking.ParkingType;

public class DayPricingStrategy implements  PricingStrategy {
    private final float dayPrice;

    public DayPricingStrategy(float dayPrice) {
        this.dayPrice = dayPrice;
    }

    @Override
    public float calculateFee(float durationInHours, ParkingType parkingType, CarType carType) {
        float amount = 0.f;

        amount =  (float)Math.ceil(durationInHours/24) * dayPrice;

        switch (carType) {
            case CONVERTIBLE -> {
                amount += 11;
                break;
            }
            case SEDAN -> {
                amount += 13;
                break;
            }
            case SUV -> {
                amount += 14;
                break;
            }
            case SPORT -> {
                amount += 45;
                break;
            }
            case CROSSOVER ->  {
                amount += 16;
                break;
            }
            case MICRO -> {
                amount += 17;
                break;
            }
            case PICKUP -> {
                amount += 18;
                break;
            }
            case VAN ->
            {
                amount += 19;
                break;
            }
        }

        return amount;
    }
}
