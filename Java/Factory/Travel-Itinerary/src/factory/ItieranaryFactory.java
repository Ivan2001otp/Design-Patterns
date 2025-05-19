package factory;

import Data.DataSource;
import itinerary.*;

import java.util.HashMap;
import java.util.Map;

public class ItieranaryFactory {

    public static Itinerary getItineraryBuilder(ItineraryType type, Object dataSource) {
     HashMap<String, Object> data = (HashMap<String, Object>) dataSource;

     return
             switch (type) {
             case BUDGET -> new BudgetBuilder(data);
             case LUXURY -> new LuxuryBuilder(data);
             case CULTURAL -> new CulturalBuilder(data);
             case ADVENTURE -> new AdventureBuilder(data);
         };
    }
}
