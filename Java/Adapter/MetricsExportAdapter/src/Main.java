import Adapter.InfluxDbAdapter;
import Adapter.PromotheusAdapter;
import clients.InfluxDbClient;
import clients.PromotheusClient;
import interfaces.MetricTracker;

public class Main {
    public static void main(String[] args) {
        MetricTracker prometheusMetricTracker = new PromotheusAdapter(new PromotheusClient());
        MetricTracker influxMetricTracker = new InfluxDbAdapter(new InfluxDbClient());

        prometheusMetricTracker.trackMetric("cpu_usage", 0.86);
        influxMetricTracker.trackMetric("memory_usage", 444.0);
    }
}