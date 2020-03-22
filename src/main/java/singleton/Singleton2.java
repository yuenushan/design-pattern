package singleton;

import java.io.*;

/**
 * 如果类是可序列化的，怎么防止通过序列化破坏单例
 */
public class Singleton2 implements Serializable {
    public static Singleton2 instance = new Singleton2();

    private Singleton2() {
        System.out.println("constructor call...");
    }

    public static Singleton2 getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        Singleton2 instance = Singleton2.getInstance();
        System.out.println(instance);
        objectOutputStream.writeObject(instance);
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        Singleton1 instance2 = (Singleton1) objectInputStream.readObject();
        System.out.println(instance2);
    }
}
