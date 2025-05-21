package listeners;

import eventType.WeatherType;

public interface EventListener {
    public void onUpdate(WeatherType weatherType);
}
