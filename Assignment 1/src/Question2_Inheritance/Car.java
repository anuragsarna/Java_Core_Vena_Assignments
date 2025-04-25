package Question2_Inheritance;

public class Car extends Vehicle{
    public Car(double speed, double fuelCapacity) {
        super(speed, fuelCapacity);
    }

    @Override
    public double getMileage() {
        return 15 + (speed/100);
    }
}
