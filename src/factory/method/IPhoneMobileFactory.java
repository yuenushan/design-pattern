package factory.method;

import factory.simple.IPhoneMobile;
import factory.simple.Mobile;

public class IPhoneMobileFactory implements MobileFactory {
    @Override
    public Mobile getMobile() {
        return new IPhoneMobile();
    }
}
