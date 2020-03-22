package singleton;

/**
 * 线程安全的懒汉模式
 */
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {

    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
