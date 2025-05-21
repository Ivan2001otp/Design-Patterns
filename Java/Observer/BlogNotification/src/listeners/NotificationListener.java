package listeners;

import models.Notification;

public interface NotificationListener {
    public void onUpdateAlert(BlogType blogType, Notification notification);
}
