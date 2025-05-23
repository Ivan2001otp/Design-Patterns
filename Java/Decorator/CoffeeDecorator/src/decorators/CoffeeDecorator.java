package decorators;

import interfaces.Coffee;

public abstract class SimpleCoffee implements Coffee {

    protected Coffee coffee;

    public SimpleCoffee() {
        this.coffee = null;
    }

    public SimpleCoffee(Coffee thisCoffee){
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
