package Question10_ObjectArrays;

public class Main {
    public static void main(String[] args){
        Product[] products = {
                new Product(101,"Laptop",47000),
                new Product(201,"Mobile",35000),
                new Product(301,"Washing Machine",25000)
        };

        Store store = new Store(products);

        store.displayProducts();

        Product expensive = store.getMostExpensiveProduct();

        System.out.println("\nMost Expensive Product is : ");
        if (expensive != null){
            expensive.display();
        }


        Product result = store.searchProductByName("Laptop");
        if (result != null){
            result.display();
        }
        else{
            System.out.println("Product not Found");
        }
    }
}
