package Question10_ObjectArrays;

public class Store {
    Product[] products;

    public Store(Product[] products){
        this.products = products;
    }

    public void displayProducts(){
        System.out.println("All Products :");
        for (Product p :products){
            p.display();
        }
    }

    public Product getMostExpensiveProduct(){
        if (products.length == 0) return null;

        Product expensive = products[0];
        for (Product p : products){
            if (p.price > expensive.price){
                expensive = p;
            }
        }
        return expensive;
    }

    public Product searchProductByName(String searchName){
        for (Product p :products){
            if (p.name.equalsIgnoreCase(searchName)){
                return p;
            }
        }
            return null;
    }
}
