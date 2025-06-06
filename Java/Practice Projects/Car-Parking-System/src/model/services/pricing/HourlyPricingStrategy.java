package model.services.pricing;

import model.car.CarType;
import model.parking.ParkingType;

public class HourlyPricingStrategy implements PricingStrategy {
    private final float hourlyRate;

    public HourlyPricingStrategy(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public float calculateFee(float durationInHours, ParkingType parkingType, CarType carType) {
        float amount = 0.f;

        amount =  durationInHours * hourlyRate;

        switch (carType) {
            case CONVERTIBLE -> {
                amount += 10;
                break;
            }
            case SEDAN -> {
                amount += 12;
                break;
            }
            case SUV -> {
                amount += 13;
                break;
            }
            case SPORT -> {
                amount += 14;
                break;
            }
            case CROSSOVER ->  {
                amount += 15;
                break;
            }
            case MICRO -> {
                amount += 16;
                break;
            }
            case PICKUP -> {
                amount += 17;
                break;
            }
            case VAN ->
            {
                amount += 18;
                break;
            }
        }

        return amount;
    }
}
