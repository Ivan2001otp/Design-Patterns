package itinerary;

import Data.DataSource;
import factory.ItineraryType;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class LuxuryBuilder implements Itinerary {
    private final HashMap<String, Object> map ;

    public LuxuryBuilder(HashMap<String, Object> dataSource) {
        this.map = dataSource;
    }

    @Override
    public List<String> getPlaces() {
        return (List<String>) map.get("places");
    }

    @Override
    public List<String> getActivities() {
        return (List<String>) map.get("activities");
    }

    @Override
    public float getEstimatedCost() {
        return (float) map.get("cost");
    }

    @Override
    public int getStayDays() {
        return (int) map.get("duration");
    }

    @Override
    public String getTips() {
        return (String) map.get("tips");
    }

    @Override
    public String getAccommodations() {
        return (String) map.get("accommodation");
    }

    public String toDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Luxury Itinerary Details:\n");
        details.append("------------------------------\n");
        details.append("Places to Visit: ").append(String.join(", ", getPlaces())).append("\n");
        details.append("Activities: ").append(String.join(", ", getActivities())).append("\n");
        details.append("Estimated Cost: $").append(getEstimatedCost()).append("\n");
        details.append("Stay Duration: ").append(getStayDays()).append(" days\n");
        details.append("Accommodation: ").append(getAccommodations()).append("\n");
        details.append("Travel Tips: ").append(getTips()).append("\n");
        return details.toString();
    }
}
