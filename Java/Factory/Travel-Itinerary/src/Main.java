import factory.ItieranaryFactory;
import factory.ItineraryType;
import itinerary.Itinerary;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static  HashMap<String, Object> hashMap = new HashMap<>();
    private static void configure() {

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

    public static void main(String[] args) {
        Main.configure();

        int input=-1;
        Scanner scanner = new Scanner(System.in);

        while(input <1 || input>5) {
            System.out.println("Which type of travel itinerary interests you ?");
            System.out.println("1. Adventure");
            System.out.println("2. Luxury");
            System.out.println("3. Cultural");
            System.out.println("4. Budget");
            System.out.println("5. Quit");
            System.out.println("Your input please : ");
            input = scanner.nextInt();

            try {
                switch (input) {
                    case 1 -> {
                        Itinerary adventureItinerary = ItieranaryFactory.getItineraryBuilder(ItineraryType.ADVENTURE, Main.hashMap.get(ItineraryType.ADVENTURE.name()));
                        System.out.println(adventureItinerary.getTips());
                    }
                    case 2 -> {
                        Itinerary luxuryItinerary = ItieranaryFactory.getItineraryBuilder(ItineraryType.LUXURY, Main.hashMap.get(ItineraryType.LUXURY.name()));
                        System.out.println(luxuryItinerary.toDetails());
                    }
                    case 3 -> {
                        Itinerary culturalItinerary = ItieranaryFactory.getItineraryBuilder(ItineraryType.CULTURAL, Main.hashMap.get(ItineraryType.CULTURAL.name()));
                        System.out.println(culturalItinerary.toDetails());
                    }
                    case 4 -> {
                        Itinerary budgetItinerary = ItieranaryFactory.getItineraryBuilder(ItineraryType.BUDGET, Main.hashMap.get(ItineraryType.BUDGET.name()));
                        System.out.println(budgetItinerary.toDetails());
                    }
                    case 5 -> {
                        System.out.println("Closing...");
                        System.exit(0);
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            } finally {

            }
        }


    }
}