package context;

import strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void initiatePayment(double amount) {
        if (this.strategy == null) {
            System.out.println("No Payment strategy selected");
            return;
        }

        strategy.pay();
    }
}
