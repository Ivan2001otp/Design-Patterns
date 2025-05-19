import Singleton.SingletonResource;

public class Main {
    public static void main(String[] args) {

        Thread threadFoo = new Thread( new ThreadFoo());
        Thread threadBar = new Thread( new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            SingletonResource singleton = SingletonResource.getInstance("ThreadFoo");
            System.out.println(singleton.value.toString());
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            SingletonResource singleton = SingletonResource.getInstance("ThreadBar");
            System.out.println(singleton.value.toString());
        }
    }
}