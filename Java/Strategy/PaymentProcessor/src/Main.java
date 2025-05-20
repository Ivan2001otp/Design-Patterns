import context.PaymentContext;
import strategy.MobileBankingStrategy;
import strategy.PostalBankingStrategy;
import strategy.UpiStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        PaymentContext context = new PaymentContext();
        Integer choice = null;


        do {
            System.out.println("1. UPI payment");
            System.out.println("2. Postal Banking payment");
            System.out.println("3. Mobile Banking payment");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    context.setPaymentStrategy(new UpiStrategy());
                    context.initiatePayment(100);
                }

                case 2 -> {
                    context.setPaymentStrategy(new PostalBankingStrategy());
                    context.initiatePayment(10);
                }

                case 3 -> {
                    context.setPaymentStrategy(new MobileBankingStrategy());
                    context.initiatePayment(3);
                }

                case 4 -> {
                    System.out.println("Exiting off");
                    System.exit(0);
                }

                default -> {
                    System.out.println(choice+ "- does not exists");
                }
            }

        } while (choice != 4);
    }
}