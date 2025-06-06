package model.car;

public class Car {
    private final String carId;
    private final CarType carType;
    private boolean hasFilledAir;

    public Car(String cardId, CarType carType) {
        this.carId = cardId;
        this.carType = carType;
        this.hasFilledAir = false;
    }

    public void fillAir(){
        this.hasFilledAir = true;
    }

    // getters
    public String getCardId() {
        return carId;
    }

    public CarType getCarType() {
        return carType;
    }

}
