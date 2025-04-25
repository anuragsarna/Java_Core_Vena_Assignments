package Question2_Inheritance;

public class Main {
    public static void main(String[] args){
        Car car = new Car(120 ,12.5);
        car.printInfo();
        System.out.println("Mileage" + car.getMileage() + "Km/L");

        Truck truck = new Truck(80 , 20.5);
        truck.printInfo();
        System.out.println("Mileage" + truck.getMileage() + "Km/L");
    }
}
