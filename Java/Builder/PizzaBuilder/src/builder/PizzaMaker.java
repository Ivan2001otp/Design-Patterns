package builder;

import java.util.Arrays;
import java.util.List;

public class PizzaMaker {

    private final String size;
    private final String crust;

    private final boolean cheese;
    private final List<String> toppings;
    private final boolean extraSauce;
    private final boolean takeAway;

    private PizzaMaker(Builder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.toppings = builder.toppings;
        this.extraSauce = builder.extraSauce;
        this.takeAway = builder.takeAway;
    }

    public static class Builder {

        private final String size,crust;

        private boolean cheese, extraSauce, takeAway;
        private  List<String> toppings;

        public Builder(String size, String crust) {
            this.size = size;
            this.crust = crust;
        }

        public Builder needCheese(boolean addCheese){
            this.cheese = addCheese;
            return this;
        }

        public Builder addExtraSauce(boolean yes) {
            this.extraSauce = yes;
            return this;
        }

        public Builder isTakeAway(boolean yes) {
            this.takeAway = yes;
            return this;
        }

        public Builder addToppings(String ... toppings) {
            this.toppings.addAll(Arrays.asList(toppings));
            return this;
        }

        public PizzaMaker build() {
            return new PizzaMaker(this);
        }
    }

}
