package notificationFactory;

import notification.Base;
import notification.EmailNotification;
import notification.PushNotification;
import notification.SmsNotification;

public class NotificationFactory {

    public static Base getNotificationSender(NotifyType notifyType) {

        return switch(notifyType) {
            case PUSH -> new PushNotification();
            case SMS -> new SmsNotification();
            case EMAIL -> new EmailNotification();
        };
    }
}
