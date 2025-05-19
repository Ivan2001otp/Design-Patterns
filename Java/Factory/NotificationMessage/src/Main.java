import notification.Base;
import notificationFactory.NotificationFactory;
import notificationFactory.NotifyType;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        Base sender = NotificationFactory.getNotificationSender(NotifyType.EMAIL);
        sender.show();
    }
}