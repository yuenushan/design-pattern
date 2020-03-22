package factory.simple;

public class Client {
    public static void main(String[] args) {
        Mobile mobile1 = MobileFactory.getMobile("huawei");
        System.out.println(mobile1.getName());
        Mobile mobile2 = MobileFactory.getMobile("iphone");
        System.out.println(mobile2.getName());
    }
}
