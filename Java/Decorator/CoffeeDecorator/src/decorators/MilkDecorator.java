package decorators;

import interfaces.Coffee;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator () {
        super();
    }

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }


    @Override
    public String getDescription() {
        String base = (coffee != null) ? coffee.getDescription() : "Plain";
        return base + ", Milk";
    }

    @Override
    public double getCost() {
        double base = (coffee != null) ? coffee.getCost() : 0;
        return base + 1.5;
    }
}
