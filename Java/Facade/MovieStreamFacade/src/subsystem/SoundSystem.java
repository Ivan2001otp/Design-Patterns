package subsystem;

public class SoundSystem {
    public void turnOn() {
        System.out.println("Sound system is ON");
    }

    public void turnOff() {
        System.out.println("Sound system is OFF");
    }

    public void setVolume(int level) {
        System.out.println(
                "Volume set to " + level
        );
    }
}
