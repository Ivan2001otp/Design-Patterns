public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Application application = new Application("toyota");
        application.initiateTires();
        application.startEngine();
        application.stopEngine();

        System.out.println();
        System.out.println();

        Application application1 = new Application("mercedes");
        application1.startEngine();
        application1.stopEngine();
        application1.initiateTires();
    }
}