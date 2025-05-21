package Adapter;

import clients.InfluxDbClient;
import interfaces.MetricTracker;

public class InfluxDbAdapter implements MetricTracker {
    private InfluxDbClient client;

    public InfluxDbAdapter(InfluxDbClient client) {
        this.client= client;
    }

    @Override
    public void trackMetric(String name, double value) {
        this.client.writePoint(name, value);
    }
}
