import decorators.MilkDecorator;
import decorators.SimpleCoffee;
import decorators.SugarDecorator;
import interfaces.Coffee;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");]
        Coffee c = new SimpleCoffee();
        Coffee coffee =
                new MilkDecorator(
                        new SugarDecorator(c)
                );


        Coffee milkshake = new MilkDecorator(new SugarDecorator());

        System.out.println(milkshake.getDescription());
        System.out.println(milkshake.getCost());

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}