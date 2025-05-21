package listeners;


import java.io.File;

public class LogOpenListener implements EventListener {

    private final File log;

    public LogOpenListener(String name){
        this.log = new File(name);
    }


    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
