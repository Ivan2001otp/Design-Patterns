package notification;

public class PushNotification implements  Base{
    @Override
    public void show() {
        System.out.println("show push notification");

    }

    @Override
    public void hide() {
        System.out.println("Hide push notification");

    }
}
