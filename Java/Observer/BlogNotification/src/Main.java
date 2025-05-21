import listeners.BlogType;
import listeners.DeviceListener;
import models.Notification;

import java.util.Random;

public class Main {

    private static double getRandom() {
        Random random = new Random();
        return random.nextInt(10 -1 + 1) + 1;
    }

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Hello world!");

        BlogManager blogManager = new BlogManager();
        blogManager.events.subscribe(BlogType.AI, new DeviceListener("Immanuel Dsouza", BlogType.AI));
        blogManager.events.subscribe(BlogType.GAMING, new DeviceListener("Seth G", BlogType.GAMING));
        blogManager.events.subscribe(BlogType.FASHION, new DeviceListener("Xavier J", BlogType.FASHION));

        blogManager.events.subscribe(BlogType.ENTERTAINMENT, new DeviceListener("Rebecca", BlogType.ENTERTAINMENT));
        blogManager.events.subscribe(BlogType.TECH, new DeviceListener("Laurie", BlogType.TECH));
        blogManager.events.subscribe(BlogType.AI, new DeviceListener("Suzan", BlogType.AI));

        double flag = 0;
        do {
            flag = getRandom();

            if (flag < 3) {//AI

                Notification notification = new Notification("K Aurther", "Learn new about Transformers");
                blogManager.events.fireNotification(BlogType.AI, notification);

            } else if (flag < 6) {//GAMING

                Notification notification = new Notification("J.J Jameson", "GTA VI coming soon on 2026 !");
                blogManager.events.fireNotification(BlogType.GAMING, notification);

            } else if (flag < 7) {//FASHION

                Notification notification = new Notification("Carlos J", "Wanna try this new Gucci **** !");
                blogManager.events.fireNotification(BlogType.FASHION, notification);

            } else if (flag < 8) {//ENTERTAINMENT

                Notification notification = new Notification("Jesssica James", "Why game mods sucks ?");
                blogManager.events.fireNotification(BlogType.ENTERTAINMENT, notification);

            } else if (flag < 9) {//TECH

                Notification notification = new Notification("Laura", "Cloud is the next hot thing , here's why !");
                blogManager.events.fireNotification(BlogType.TECH, notification);

            }

            Thread.sleep(2000);
        } while (flag != 10);

    }
}