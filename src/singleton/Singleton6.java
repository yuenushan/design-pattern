package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 利用静态内部类实现单例
 *
 * 在《深入理解JAVA虚拟机》中，有这么一句话:
 *
 * 虚拟机会保证一个类的<clinit>()方法在多线程环境中被正确地加锁、同步，如果多个线程同时去初始化一个类，那么只会有一个线程去执行这个类的<clinit>()方法，其他线程都需要阻塞等待，直到活动线程执行<clinit>()方法完毕。
 *
 * 静态内部类也有着一个致命的缺点，就是传参的问题，由于是静态内部类的形式去创建单例的，故外部无法传递参数进去
 */
public class Singleton6 {

    private Singleton6() {

    }

    private static class SingletonHolder {
        private static Singleton6 instance = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return SingletonHolder.instance;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 反射破坏单例
        System.out.println(Singleton6.getInstance());
        Constructor<Singleton6> constructor = Singleton6.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        System.out.println(constructor.newInstance());
    }
}
