package engines;

public class MercedesEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Starting Mercedes Engine !");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Mercedes Engine !");
    }
}
