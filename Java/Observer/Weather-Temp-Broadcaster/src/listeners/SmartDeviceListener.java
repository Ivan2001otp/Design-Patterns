package listeners;

import eventType.WeatherType;

public class SmartDeviceListener implements EventListener {
    private final String registeredEmail;

    public SmartDeviceListener(String email) {
        this.registeredEmail  = email;
    }

    @Override
    public void onUpdate(WeatherType weatherType) {
        System.out.println("Update on registered email smartphone - " + this.registeredEmail);
        System.out.println("Update on your smartphone, there's change in weather - " + weatherType.name());
        System.out.println();
        System.out.println();
    }
}
