package factory.abstract1;

import factory.simple.HuweiMobile;
import factory.simple.Mobile;

public class HuaWeiProductFactory implements ElectronicProductFactory {
    @Override
    public Mobile getMobile() {
        return new HuweiMobile();
    }

    @Override
    public Computer getComputer() {
        return new HuaWeiComputer();
    }
}
