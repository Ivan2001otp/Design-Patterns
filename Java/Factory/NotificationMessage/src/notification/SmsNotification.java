package notification;

public class SmsNotification implements Base {
    @Override
    public void show() {
        System.out.println("show sms notification");

    }

    @Override
    public void hide() {
        System.out.println("Hide sms notification");

    }
}
