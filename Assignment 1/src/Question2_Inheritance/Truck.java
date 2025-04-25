package Question2_Inheritance;

public class Truck extends Vehicle{
    public Truck(double speed , double fuelCapacity){
        super(speed, fuelCapacity);
    }

    @Override
    public double getMileage() {
        return 8 - (speed/200);
    }
}
