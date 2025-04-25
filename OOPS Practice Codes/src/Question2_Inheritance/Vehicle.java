package Question2_Inheritance;

class Vehicle {
    double speed;
    double fuelCapacity;

    public Vehicle(double speed , double fuelCapacity){
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public double getMileage() {
        return 0.0;
    }

    public void printInfo() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + " L");
    }
}


