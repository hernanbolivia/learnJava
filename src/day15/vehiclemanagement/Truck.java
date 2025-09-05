package day15.vehiclemanagement;

public class Truck extends Vehicle{

    private double loadCapacity;


    public Truck(){
        this("Unknown","Unknown",0,0.0);
    }

    public Truck(String brand, String model, int year) {
        this(brand, model, year,0.0);
    }

    public Truck(String brand, String model, int year, double loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }


    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf("%-15s: %.2f%n", "Load Capacity", this.loadCapacity);
    }

    @Override
    public void performMaintenance() {
        super.performMaintenance();
        System.out.println("Truck has been maintenance. Check doors and neumatic");
    }
}
