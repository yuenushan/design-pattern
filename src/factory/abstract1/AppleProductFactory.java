package factory.abstract1;

import factory.simple.IPhoneMobile;
import factory.simple.Mobile;

public class AppleProductFactory implements ElectronicProductFactory {
    @Override
    public Mobile getMobile() {
        return new IPhoneMobile();
    }

    @Override
    public Computer getComputer() {
        return new AppleComputer();
    }
}
