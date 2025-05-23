package factories;

import engines.Engine;
import engines.ToyotaEngine;
import tires.Tire;
import tires.ToyotaTires;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }

    @Override
    public Tire createTires() {
        return new ToyotaTires();
    }
}
