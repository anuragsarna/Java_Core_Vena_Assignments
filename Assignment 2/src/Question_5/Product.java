package Question_5;

public class Product {
    int id;
    String name;
    double price;
    double rating;
    int stock;

    public Product(int id, String name, double price, double rating, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + ", rating=" + rating + ", stock=" + stock + "}";
    }
}
