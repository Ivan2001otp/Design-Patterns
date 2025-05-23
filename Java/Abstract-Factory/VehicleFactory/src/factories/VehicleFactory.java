package factories;

import engines.Engine;
import tires.Tire;

public interface VehicleFactory {
    Engine createEngine();
    Tire createTires();
}
