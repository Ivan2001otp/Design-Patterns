package strategy;

public class PostalBankingStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("postal banking payment init..");

    }
}
