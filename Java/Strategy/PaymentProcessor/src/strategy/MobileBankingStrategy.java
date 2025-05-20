package strategy;

public class MobileBankingStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("MobileBanking payment init..");

    }
}
