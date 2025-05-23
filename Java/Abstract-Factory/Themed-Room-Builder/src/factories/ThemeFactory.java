package factories;

import Beds.Bed;
import Desks.Desk;
import Lightings.Lighting;

public interface ThemeFactory {
     Bed createBed();
     Desk createDesk();
     Lighting createLighting();
}
