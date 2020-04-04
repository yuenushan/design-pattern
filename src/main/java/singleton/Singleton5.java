package singleton;

/**
 * 线程安全的懒汉模式——DCL优化（双重检查锁定DCL(double-checked locking)）
 *
 * INSTANCE  = new SingleTon();
 * 这个步骤，其实在jvm里面的执行分为三步：
 *
 *   1.在堆内存开辟内存空间。
 *   2.在堆内存中实例化SingleTon里面的各个参数。
 *   3.把对象指向堆内存空间。
 *
 * 由于jvm存在乱序执行功能，所以可能在2还没执行时就先执行了3，如果此时再被切换到线程B上，由于执行了3，INSTANCE 已经非空了，会被直接拿出来用，这样的话，就会出现异常。这个就是著名的DCL失效问题。
 *
 * 不过在JDK1.5之后，官方也发现了这个问题，故而具体化了volatile，即在JDK1.6及以后，只要定义为private volatile static SingleTon  INSTANCE = null;就可解决DCL失效问题。volatile确保INSTANCE每次均在主内存中读取，这样虽然会牺牲一点效率，但也无伤大雅。
 */
public class Singleton5 {

    private static  Singleton5 instance;

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

}
