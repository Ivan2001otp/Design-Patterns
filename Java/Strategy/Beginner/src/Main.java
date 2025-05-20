import strategy.PaybyCreditCard;
import strategy.PaybyPayPal;
import strategy.PaymentStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static PaymentStrategy strategy;

    public static void main(String[] args) throws IOException  {

        System.out.println("Hello world!");

        System.out.println("1 - Initiate payment from Paypal");
        System.out.println("2 - Initiate payment from Credit Card");

        int choice ;
        System.out.println("Enter your choice : ");
        choice = Integer.parseInt(reader.readLine());

        switch(choice) {
            case 1 -> {
                strategy = new PaybyPayPal();
                strategy.collectPaymentDetails();
                System.out.println(strategy.pay(100));
            }
            case 2 -> {
                strategy = new PaybyCreditCard();
                strategy.collectPaymentDetails();

                System.out.println(strategy.pay(140));
            }
            default -> {
                System.out.println("The given choice - "+choice+ " does not exist.");
            }
        }

    }
}