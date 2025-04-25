package Question10_ObjectArrays;

public class Product {
    int id;
    String name;
    double price;

    Product(int id , String name , double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println("-----------------------");
        System.out.println("Id : " + id + " , Name : " + name + " , price : " + price);
    }
}
