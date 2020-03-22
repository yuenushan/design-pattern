package factory.method;

import factory.simple.Mobile;

public class Client {
    public static void main(String[] args) {
        Mobile mobile1 = new IPhoneMobileFactory().getMobile();
        Mobile mobile2 = new HuaWeiMobileFactory().getMobile();
        System.out.println(mobile1.getName());
        System.out.println(mobile2.getName());
    }
}
