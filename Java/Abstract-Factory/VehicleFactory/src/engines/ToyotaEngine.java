package engines;

public class ToyotaEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Starting Toyota Engine !");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Toyota Engine !");
    }
}
