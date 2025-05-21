package clients;

public class InfluxDbClient {
    public void writePoint(String metricName, double value) {
        System.out.println("InfluxDB : Recording metric  " + metricName + " with value " + value);
    }

}
