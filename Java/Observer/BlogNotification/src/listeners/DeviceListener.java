package listeners;

import models.Notification;

public class DeviceListener implements NotificationListener {

    private final String userName;
    private final BlogType blogType;

    public DeviceListener(String userName, BlogType blogType) {
        this.userName = userName;
        this.blogType = blogType;
    }


    @Override
    public void onUpdateAlert(BlogType blogType, Notification notification) {
        System.out.println(userName + " is subscribed to BlogType - " + this.blogType.name());
        System.out.println(userName + " got new Notification !");
        System.out.println(notification.toString());
        System.out.println();
        System.out.println();
    }
}
