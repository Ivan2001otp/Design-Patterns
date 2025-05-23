package factories;

import Beds.Bed;
import Beds.VictorianBed;
import Desks.Desk;
import Desks.VictorianDesk;
import Lightings.Lighting;
import Lightings.VictorianLighting;

public class VictorianThemeFactory implements ThemeFactory {
    @Override
    public Bed createBed() {
        return new VictorianBed();
    }

    @Override
    public Desk createDesk() {
        return new VictorianDesk();
    }

    @Override
    public Lighting createLighting() {
        return new VictorianLighting();
    }
}
