package gauger;

import eventType.WeatherType;
import listeners.EventListener;
import publisher.EventManager;

import java.util.List;

public class WeatherObserver {
    public EventManager eventManager;

    public WeatherObserver() {
        this.eventManager = new EventManager(WeatherType.AUTUMN.name(), WeatherType.MONSOON.name(),
                                            WeatherType.SUMMER.name(), WeatherType.WINTER.name() );
    }

        public void changeTemperature(double value) {

            if (value < 15) {
                // less than 15C - (degree celsius)
                eventManager.notify(WeatherType.WINTER.name());
            } else if(value >= 16 && value <= 24) {
                eventManager.notify(WeatherType.AUTUMN.name());
            } else if (value >= 25 && value <= 32) {
                eventManager.notify(WeatherType.MONSOON.name());
            } else if (value >= 33) {
                eventManager.notify(WeatherType.SUMMER.name());
            }

        }
}
