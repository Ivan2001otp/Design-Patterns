package clients;

public class PromotheusClient {
    public void observe(String metricName, double value) {
        System.out.println("Promotheus : Recording metric  " + metricName + " with value " + value);
    }
}
