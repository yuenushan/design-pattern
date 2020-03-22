package factory.method;

import factory.simple.HuweiMobile;
import factory.simple.Mobile;

public class HuaWeiMobileFactory implements MobileFactory {
    @Override
    public Mobile getMobile() {
        return new HuweiMobile();
    }
}
