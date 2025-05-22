package builder;

public class Computer {
    // required params
    private final String CPU;
    private final String RAM;

    // optional
    private final String storage;
    private final boolean hasGraphicsCard;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
    }

    public static class Builder{
        private final String CPU;
        private final String RAM;

        private String storage;
        private boolean hasGraphicsCard;

        public Builder(String cpu, String ram) {
            this.CPU = cpu;
            this.RAM = ram;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }


    }


    public void showConfig() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + hasGraphicsCard);
    }
}
