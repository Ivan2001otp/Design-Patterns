package Adapter;

import clients.PromotheusClient;
import interfaces.MetricTracker;

public class PromotheusAdapter implements MetricTracker {
    private PromotheusClient client;

    public PromotheusAdapter(PromotheusClient client) {
        this.client = client;
    }

    @Override
    public void trackMetric(String name, double value) {
        this.client.observe(name, value);
    }
}
