package decorators;

import interfaces.Coffee;

public class SimpleCoffee extends CoffeeDecorator {
    public SimpleCoffee () {
        super();
    }

    public SimpleCoffee(Coffee coffee) {
        super(coffee);
    }


    @Override
    public String getDescription() {
        return (coffee != null ? coffee.getDescription() + ", " : "" ) + "Simple Coffee";
    }

    @Override
    public double getCost() {
        return (coffee != null ? coffee.getCost() : 0) + 5;
    }
}
