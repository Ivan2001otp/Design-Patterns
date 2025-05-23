package decorators;

import interfaces.Coffee;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator() {
        this.coffee = null;
    }

    public CoffeeDecorator(Coffee thisCoffee){
        this.coffee = thisCoffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

}
