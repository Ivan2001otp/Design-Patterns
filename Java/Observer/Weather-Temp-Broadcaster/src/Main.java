import eventType.WeatherType;
import gauger.WeatherObserver;
import listeners.SmartDeviceListener;
import listeners.TelevisionListener;

import java.util.Random;

public class Main {
    public static double randomTempGenerator() {
        Random random = new Random();
        return random.nextInt(45 - 12 + 1) + 12;
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        WeatherObserver weatherObserver = new WeatherObserver();

        // Different users will get specific weather type notification, but we can add same user to get multiple weather type
        weatherObserver.eventManager.subscribe(WeatherType.AUTUMN.name(), new SmartDeviceListener("abc@gmail.com"));
        weatherObserver.eventManager.subscribe(WeatherType.MONSOON.name(), new SmartDeviceListener("ivan@gmail.com"));

        weatherObserver.eventManager.subscribe(WeatherType.SUMMER.name(), new SmartDeviceListener("youtube@gmail.com"));
        weatherObserver.eventManager.subscribe(WeatherType.AUTUMN.name(), new SmartDeviceListener("youtube@gmail.com"));

        weatherObserver.eventManager.subscribe(WeatherType.WINTER.name(), new SmartDeviceListener("harman@gmail.com"));


        weatherObserver.eventManager.subscribe(WeatherType.AUTUMN.name(), new TelevisionListener());
        weatherObserver.eventManager.subscribe(WeatherType.MONSOON.name(), new TelevisionListener());
        weatherObserver.eventManager.subscribe(WeatherType.SUMMER.name(), new TelevisionListener());
        weatherObserver.eventManager.subscribe(WeatherType.WINTER.name(), new TelevisionListener());


        double onChangeValue = randomTempGenerator();

        if (onChangeValue <= 15) {
            weatherObserver.eventManager.notify(WeatherType.WINTER.name());
        } else if (onChangeValue <= 24) {
            weatherObserver.eventManager.notify(WeatherType.AUTUMN.name());
        } else if (onChangeValue <= 32 ) {
            weatherObserver.eventManager.notify(WeatherType.MONSOON.name());
        } else {
            weatherObserver.eventManager.notify(WeatherType.SUMMER.name());
        }

    }
}