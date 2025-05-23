package builder;

public class Machine {
    private final String CPU;
    private final String RAM;

    private final String GPU;
    private final String storageType;
    private final int storageSize;
    private final boolean hasWifi;
    private final boolean hasBluetooth;

    private Machine (Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.GPU = builder.GPU;
        this.storageType = builder.storageType;
        this.storageSize = builder.storageSize;

        this.hasWifi = builder.hasWifi;
        this.hasBluetooth = builder.hasBluetooth;
    }
    public void showSpecs() {
        System.out.println("CPU : "+ this.CPU);
        System.out.println("RAM : "+ this.RAM);
        System.out.println("GPU : "+ this.GPU);
        System.out.println("Storage Type : "+ this.storageType);
        System.out.println("Storage Size : "+ this.storageSize);
        System.out.println("hasWifi : "+ this.hasWifi);
        System.out.println("hasBluetooth : "+ this.hasBluetooth);
    }

    public static class Builder {
        private final String CPU;
        private final String RAM;

        private  String GPU;
        private  String storageType;
        private  int storageSize;
        private  boolean hasWifi;
        private  boolean hasBluetooth;



        public Builder(String cpu, String ram) {
            this.CPU = cpu;
            this.RAM = ram;
        }

        public Builder setGPU(String gpu) {
            this.GPU = gpu;
            return this;
        }

        public Builder setStorageType(String type) {
            this.storageType = type;
            return this;
        }

        public Builder setStorageSize(int size){
            this.storageSize = size;
            return this;
        }

        public Builder setWifi(boolean b){
            this.hasWifi = b;return this;
        }

        public Builder setBluetooth(boolean b){
            this.hasBluetooth = b;
            return this;
        }

        public Machine build() {
            return new Machine(this);
        }

    }
}
