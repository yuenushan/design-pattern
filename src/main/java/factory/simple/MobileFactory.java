package factory.simple;

/**
 * 简单工厂模式：
 *  优点：简单
 *  缺点：增加新的手机类型，需要改原有代码。不符合对扩展封闭的设计原则
 */
public class MobileFactory {
    public static Mobile getMobile(String name) {
        if ("iphone".equals(name)) {
            return new IPhoneMobile();
        } else if ("huawei".equals(name)) {
            return new HuweiMobile();
        } else {
            return null;
        }
    }
}
