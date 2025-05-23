import Beds.Bed;
import Desks.Desk;
import Lightings.Lighting;
import factories.FuturisticThemeFactory;
import factories.ModernThemeFactory;
import factories.ThemeFactory;
import factories.VictorianThemeFactory;

public class Application {

    private ThemeFactory themeFactory;
    private Bed themeBed;
    private Desk themeDesk;
    private Lighting themeLighting;

    public Application(String theme) {
        if (theme.equalsIgnoreCase("modern")) {
            themeFactory = new ModernThemeFactory();
            themeBed = themeFactory.createBed();
            themeDesk = themeFactory.createDesk();
            themeLighting = themeFactory.createLighting();

        } else if (theme.equalsIgnoreCase("futuristic")) {
            themeFactory = new FuturisticThemeFactory();
            themeBed = themeFactory.createBed();
            themeDesk = themeFactory.createDesk();
            themeLighting = themeFactory.createLighting();

        } else if (theme.equalsIgnoreCase("victorian")) {
            themeFactory = new VictorianThemeFactory();
            themeBed = themeFactory.createBed();
            themeDesk = themeFactory.createDesk();
            themeLighting = themeFactory.createLighting();
        }
    }


    public void activity() {
        themeBed.calmSleep();
        themeDesk.read();
        themeLighting.toggleLighting();
    }
}
