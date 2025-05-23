import factories.GUIFactory;
import factories.MacOsFactory;
import factories.WindowOsFactory;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.equalsIgnoreCase("mac")) {
            guiFactory = new MacOsFactory();
        } else {
            guiFactory = new WindowOsFactory();
        }

        Application application = new Application(guiFactory);
        application.paint();

    }
}