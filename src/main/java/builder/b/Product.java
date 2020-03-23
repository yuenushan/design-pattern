package builder.b;

public class Product {
    private String a;
    private String b;
    private String c;

    public Product(Builder builder) {
        a = builder.a;
        b = builder.b;
        c = builder.c;
    }

    @Override
    public String toString() {
        return "Product{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }

    public static class Builder {

        private String a;
        private String b;
        private String c;

        public Builder buildA(String a) {
            this.a = a;
            return this;
        }

        public Builder buildB(String b) {
            this.b = b;
            return this;
        }

        public Builder buildC(String c) {
            this.c = c;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
