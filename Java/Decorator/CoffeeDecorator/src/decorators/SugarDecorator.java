package decorators;

import interfaces.Coffee;

public class SugarDecorator extends CoffeeDecorator {


    public SugarDecorator () {
        super();
    }

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        String base = (coffee != null) ? coffee.getDescription() : "Plain";
        return base + ", Sugar";
    }

    @Override
    public double getCost() {
        double base = (coffee != null) ? coffee.getCost() : 0;
        return base + 0.5;
    }
}
