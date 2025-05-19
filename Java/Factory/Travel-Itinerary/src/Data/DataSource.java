package Data;

import factory.ItineraryType;

import java.util.HashMap;
import java.util.List;

public class DataSource {
    public  HashMap<String, Object> hashMap = new HashMap<>();

    public DataSource() {

        HashMap<String, Object> luxuryMap = new HashMap<>();
        luxuryMap.put("type", ItineraryType.LUXURY.name());
        luxuryMap.put("places", List.of("Dubai","Bali","Paris", "Santorini"));
        luxuryMap.put("duration", 7);
        luxuryMap.put("cost", 4500);
        luxuryMap.put("activities", List.of("Spa Retreats", "Fine Dining", "Yacht Cruises", "Private Tours"));
        luxuryMap.put("accommodation", "5-Star Hotels, Private Villas");
        luxuryMap.put("tips", "Book private airport transfers and use concierge services to customize your experience.");
        hashMap.put(ItineraryType.LUXURY.name(), luxuryMap);


        HashMap<String, Object> adventureMap = new HashMap<>();
        luxuryMap.put("type", ItineraryType.ADVENTURE.name());
        luxuryMap.put("places", List.of("Patagonia", "Yosemite National Park", "Banff National Park", "Mount Kilimanjaro"));
        luxuryMap.put("duration", 12);
        luxuryMap.put("cost", 1500);
        luxuryMap.put("activities", List.of("Hiking", "Mountain Climbing", "Camping", "Whitewater Rafting"));
        luxuryMap.put("accommodation", "Tents, Cabins, Hostels");
        luxuryMap.put("tips", "Pack light but durable gear, carry a portable stove and stay hydrated.");
        hashMap.put(ItineraryType.ADVENTURE.name(), adventureMap);


        HashMap<String, Object> budgetMap = new HashMap<>();
        luxuryMap.put("type", ItineraryType.BUDGET.name());
        luxuryMap.put("places", List.of("Thailand", "Vietnam", "Portugal", "Colombia"));
        luxuryMap.put("duration", 15);
        luxuryMap.put("cost", 800);
        luxuryMap.put("activities", List.of("Backpacking", "Street Food Tours", "Free Walking Tours", "Night Markets"));
        luxuryMap.put("accommodation", "Hostels, Guesthouses, Couchsurfing");
        luxuryMap.put("tips", "Use public transport, avoid tourist traps, and cook meals when possible.");
        hashMap.put(ItineraryType.BUDGET.name(), budgetMap);


        HashMap<String, Object> culturalMap = new HashMap<>();
        luxuryMap.put("type", ItineraryType.CULTURAL.name());
        luxuryMap.put("places", List.of("Kyoto", "Rome", "Marrakech", "Ram Temple"));
        luxuryMap.put("duration", 10);
        luxuryMap.put("cost", 2500);
        luxuryMap.put("activities", List.of("Museum Visits", "Historical Site Tours", "Traditional Cooking Classes", "Local Festivals"));
        luxuryMap.put("accommodation", "Boutique Hotels, Homestays");
        luxuryMap.put("tips", "Learn basic local phrases, be respectful of customs, and explore beyond the main attractions.");
        hashMap.put(ItineraryType.CULTURAL.name(), culturalMap);


    }


}
