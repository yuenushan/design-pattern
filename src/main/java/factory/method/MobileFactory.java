package factory.method;

import factory.simple.Mobile;

/**
 * 工厂方法模式：
 *  优点：符合开闭原则，需要扩展新的手机类型的时候，只需要实现新的手机类和手机工厂
 *  缺点：需要创建更多的类
 */
public interface MobileFactory {
    Mobile getMobile();
}
