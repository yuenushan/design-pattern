package factory.abstract1;

public class Client {
    public static void main(String[] args) {
        Computer computer1 = new AppleProductFactory().getComputer();
        Computer computer2 = new HuaWeiProductFactory().getComputer();
        System.out.println(computer1.getName());
        System.out.println(computer2.getName());
    }
}
