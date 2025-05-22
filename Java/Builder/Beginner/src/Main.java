import builder.Computer;

public class Main {
    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .graphicsCard(true)
                .storage("1TB SSD")
                .build();
        System.out.println("Gaming PC Config :");
        gamingPC.showConfig();
        System.out.println();
        Computer officePC = new Computer.Builder("Intel i5", "16GB")
                .build();

        System.out.println("Office PC config :");
        officePC.showConfig();
    }
}