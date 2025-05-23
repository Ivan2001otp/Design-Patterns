import builder.PizzaMaker;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        PizzaMaker pizzaMaker = new PizzaMaker.Builder("10", "Stuffed")
                .addExtraSauce(true)
                .addToppings("olives","mushroom","pepperoni")
                .isTakeAway(false)
                .needCheese(true)
                .build();

        PizzaMaker pizzaMaker1 = new PizzaMaker.Builder("7", "Thin")
                .addExtraSauce(true)
                .needCheese(true)
                .isTakeAway(true)
                .build();
    }
}