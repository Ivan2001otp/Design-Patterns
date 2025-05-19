package itinerary;

import java.util.List;

public interface Itinerary {

    public List<String> getPlaces();

    public List<String> getActivities();

    public float getEstimatedCost();

    public int getStayDays();

    public String getTips();

    public String getAccommodations();

    public String toDetails();
}