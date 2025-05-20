package strategy;

public class UpiStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("UPI payment init..");
    }
}
