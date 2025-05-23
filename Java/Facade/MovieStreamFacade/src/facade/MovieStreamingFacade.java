package facade;

import subsystem.Lights;
import subsystem.SoundSystem;
import subsystem.StreamingDevice;
import subsystem.TV;

public class MovieStreamingFacade {
    private final Lights lightSystem;
    private final SoundSystem soundSystem;
    private final StreamingDevice streamingDevice;
    private final TV tv;

    public MovieStreamingFacade() {
        lightSystem = new Lights();
        soundSystem = new SoundSystem();
        streamingDevice = new StreamingDevice();
        tv = new TV();
    }


    public void startMovie() {
        System.out.println("Starting to watch Movie !");
        lightSystem.turnOn();
        lightSystem.dim();
        soundSystem.turnOn();
        soundSystem.setVolume(10);
        streamingDevice.connect();
        streamingDevice.play("Lord of Rings");
    }

    public void stopMovie() {
        System.out.println("Stopping to watch Movie !");
        lightSystem.turnOff();
        soundSystem.turnOff();
        streamingDevice.disconnect();
    }
}
