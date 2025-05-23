package factories;

import Beds.Bed;
import Beds.ModernBed;
import Desks.Desk;
import Desks.ModernDesk;
import Lightings.FuturisticLighting;
import Lightings.Lighting;
import Lightings.ModernLighting;

public class ModernThemeFactory implements ThemeFactory {
    @Override
    public Bed createBed() {
        return new ModernBed();
    }

    @Override
    public Desk createDesk() {
        return new ModernDesk();
    }

    @Override
    public Lighting createLighting() {
        return new ModernLighting();
    }
}
