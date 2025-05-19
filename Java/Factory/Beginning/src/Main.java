import BaseII.Dialog;
import ConcreteII.StandardDialogBox;
import ConcreteII.StyledDialogBox;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        configure();
        renderDialog();
    }

    static void renderDialog() {
        dialog.renderWindow();
    }

    static void configure() {
        Random random = new Random();

        int result = random.nextInt(1,10);

        if (result>5 && result<=10) {
            dialog = new StandardDialogBox();
        } else {
            dialog = new StyledDialogBox();
        }
    }
}