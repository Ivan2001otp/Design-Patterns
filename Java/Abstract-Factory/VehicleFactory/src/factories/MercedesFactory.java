package factories;

import engines.Engine;
import engines.MercedesEngine;
import tires.MercedesTires;
import tires.Tire;

public class MercedesFactory implements VehicleFactory{

    @Override
    public Engine createEngine() {
        return new MercedesEngine();
    }

    @Override
    public Tire createTires() {
        return new MercedesTires();
    }
}
