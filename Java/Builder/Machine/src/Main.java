import builder.Machine;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine.Builder("Intel i9", "32GB")
                .setBluetooth(true)
                .setWifi(true)
                .setGPU("GTX 1650Ti")
                .setStorageType("SSD+HDD")
                .setStorageSize(1000)
                .build();


        Machine machine2 = new Machine.Builder("Intel i9", "32GB")
                .setBluetooth(true)
                .setWifi(true)
                .build();
        machine2.showSpecs();
        machine.showSpecs();
    }
}