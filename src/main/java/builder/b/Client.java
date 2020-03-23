package builder.b;

public class Client {
    public static void main(String[] args) {
        Product product = new Product.Builder()
                .buildA("油")
                .buildB("菜")
                .buildC("盐")
                .build();
        System.out.println(product);
    }
}
