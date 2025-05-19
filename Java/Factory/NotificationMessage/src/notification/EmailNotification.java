package notification;

public class EmailNotification implements Base {
    @Override
    public void show() {
        System.out.println(
                "Show email Notification"
        );
    }

    @Override
    public void hide() {
        System.out.println("Hide email notification");
    }
}
