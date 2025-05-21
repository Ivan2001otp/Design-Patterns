import editor.Editor;
import listeners.EmailNotificationListener;
import listeners.LogOpenListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        String filePath = "D://Legacy codes//Design Patterns//Java//Observer//Beginner//src//test.txt";
        editor.events.subscribe("open", new EmailNotificationListener("immanuel123@gmail.com"));
        editor.events.subscribe("open", new EmailNotificationListener("test.cinepebble@gmail.com"));
        editor.events.subscribe("open", new EmailNotificationListener("featsclub@gmail.com"));

        editor.events.subscribe("save", new LogOpenListener(filePath));


        try {
            editor.openFile(filePath);
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}