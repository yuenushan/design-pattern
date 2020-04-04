package builder.a;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.build(new ConcreteBuilder());
    }
}
