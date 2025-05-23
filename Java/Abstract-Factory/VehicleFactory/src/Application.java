import engines.Engine;
import factories.MercedesFactory;
import factories.ToyotaFactory;
import factories.VehicleFactory;
import tires.Tire;

public class Application {
    private VehicleFactory vehicleFactory;
    private Engine engine;
    private Tire tires;

    public Application(String vehicleName) {
        if (vehicleName.equalsIgnoreCase("toyota")) {
            vehicleFactory = new ToyotaFactory();
            engine = vehicleFactory.createEngine();
            tires = vehicleFactory.createTires();
        } else {
            vehicleFactory = new MercedesFactory();
            engine = vehicleFactory.createEngine();
            tires = vehicleFactory.createTires();
        }
    }

    public void startEngine() {
        engine.startEngine();
    }

    public void stopEngine() {
        engine.stopEngine();
    }

    public void initiateTires() {
        tires.momentOfInertia();
    }
}
