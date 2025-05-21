package listeners;

import eventType.WeatherType;

public class TelevisionListener implements EventListener {
    @Override
    public void onUpdate(WeatherType weatherType) {
        System.out.println("Update on your television network, there's change in weather - " + weatherType.name());
        System.out.println();
        System.out.println();
    }
}
