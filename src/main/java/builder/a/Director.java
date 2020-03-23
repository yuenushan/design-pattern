package builder.a;

public class Director {
    public Product build(AbstractBuilder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getProduct();
    }
}
