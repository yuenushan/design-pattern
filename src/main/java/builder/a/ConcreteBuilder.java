package builder.a;

public class ConcreteBuilder extends AbstractBuilder{

    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public void buildA() {
        product.createA("放油");
    }

    @Override
    public void buildB() {
        product.createB("放菜");
    }

    @Override
    public void buildC() {
        product.createC("放盐");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
