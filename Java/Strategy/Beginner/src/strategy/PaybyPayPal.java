package strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaybyPayPal implements PaymentStrategy {
    private String email;
    private String password;
    private boolean signedIn;
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Paying "+paymentAmount+" using PayPal.");
            return true;
        }
        return false;
    }

    private boolean verify() {
        this.signedIn = this.password.equalsIgnoreCase("password");
        return this.signedIn;
    }

    @Override
    public void collectPaymentDetails() {

        try {
            while(!signedIn) {
                System.out.println("Enter user's email : ");
                email = READER.readLine();

                System.out.println("Enter password : ");
                password = READER.readLine();

                if (verify()) {
                    System.out.println("Data verified successfully !");
                } else {
                    System.out.println("Wrong credentials !");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
