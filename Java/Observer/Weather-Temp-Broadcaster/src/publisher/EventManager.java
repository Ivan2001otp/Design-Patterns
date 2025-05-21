package publisher;

import eventType.WeatherType;
import listeners.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String ... events) {
        for (String event : events) {
            listeners.put(event, new ArrayList<>());
        }
    }

    public void subscribe (String eventType ,EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe (String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    private WeatherType eventTypeToEnum(String eventType) {
        switch (eventType) {
            case "AUTUMN" -> {
                return WeatherType.AUTUMN;
            }
            case "WINTER" -> {
                return WeatherType.WINTER;
            }
            case "SUMMER" -> {
                return WeatherType.SUMMER;
            }
            case "MONSOON" -> {
                return WeatherType.MONSOON;
            }
        }

        return WeatherType.AUTUMN; // This will never execute.
    }

    public void notify (String eventType) {
        List<EventListener> users = listeners.get(eventType);

        for (EventListener listener : users) {
            listener.onUpdate(eventTypeToEnum(eventType));
        }
    }
}
