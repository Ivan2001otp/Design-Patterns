package Singleton;

public final class SingletonResource {

    private static volatile SingletonResource instance;

    public String value;

    // Private constructor.
    private SingletonResource(String value) {
        this.value = value;
    }

    public static SingletonResource getInstance (String value) {
        SingletonResource result = instance;

        if (result != null ){
            return result;
        }

        synchronized (SingletonResource.class) {
            if (instance != null) {
                instance = new SingletonResource(value);
            }
            return instance;
        }
    }
}
