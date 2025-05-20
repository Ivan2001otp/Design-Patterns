package strategy;

import model.CreditCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaybyCreditCard implements PaymentStrategy{
    private CreditCard creditCard;
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public boolean pay(int paymentAmount) {
        if (isCardActive()) {
            System.out.println("Paying "+paymentAmount+" from Credit Card!");
            creditCard.setAmount(paymentAmount);
            return true;
        }
        return false;
    }

    private boolean isCardActive() {
        return this.creditCard != null;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter card Number");
            String cardNumber = READER.readLine();

            System.out.println("Enter Expiry date of credit card");
            String date = READER.readLine();

            System.out.println("Enter CVV");
            String cvv = READER.readLine();

            creditCard = new CreditCard(cardNumber, date, cvv);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
