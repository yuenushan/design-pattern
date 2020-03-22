package factory.abstract1;

import factory.simple.Mobile;

/**
 * 抽象工厂模式：相当于支持多个产品的工厂方法模式
 */
public interface ElectronicProductFactory {
    Mobile getMobile();
    Computer getComputer();
}
