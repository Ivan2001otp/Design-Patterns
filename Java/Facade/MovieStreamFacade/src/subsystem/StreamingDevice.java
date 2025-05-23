package subsystem;

public class StreamingDevice {
    public void connect() {
        System.out.println("connect to stream device");
    }

    public void disconnect() {
        System.out.println("disconnect from stream device");
    }

    public void play(String movie) {
        System.out.println("playing " + movie);
    }
}
