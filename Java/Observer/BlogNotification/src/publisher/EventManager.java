package publisher;

import listeners.BlogType;
import listeners.NotificationListener;
import models.Notification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<NotificationListener>> listeners = new HashMap<>();

    public EventManager (BlogType ... events) {
        for(BlogType event : events) {
            listeners.put(event.name(), new ArrayList<>());
        }
    }

    public void subscribe(BlogType blogType, NotificationListener newListener) {
        List<NotificationListener> subscribedUsers = listeners.get(blogType.name());
        subscribedUsers.add(newListener);
    }

    public void unsubscribe(BlogType blogType, NotificationListener oldListener) {
        List<NotificationListener> subscribedUsers = listeners.get(blogType.name());
        subscribedUsers.remove(oldListener);
    }

    public void fireNotification(BlogType blogType, Notification notification) {
        List<NotificationListener> users = listeners.get(blogType.name());
        System.out.println("Sending new notifications for blog Niche - " + blogType.name());
        for (NotificationListener user : users) {
            user.onUpdateAlert(blogType, notification);
        }
    }
}
