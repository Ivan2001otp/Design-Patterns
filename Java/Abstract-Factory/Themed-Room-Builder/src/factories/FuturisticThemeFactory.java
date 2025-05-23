package factories;

import Beds.Bed;
import Beds.FuturisticBed;
import Desks.Desk;
import Desks.FuturisticDesk;
import Lightings.FuturisticLighting;
import Lightings.Lighting;

public class FuturisticThemeFactory implements ThemeFactory {
    @Override
    public Bed createBed() {
        return new FuturisticBed();
    }

    @Override
    public Desk createDesk() {
        return new FuturisticDesk();
    }

    @Override
    public Lighting createLighting() {
        return new FuturisticLighting();
    }
}
