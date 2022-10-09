package day13.task;

public class Product {

    String product;
    int price;

    public Product(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}

