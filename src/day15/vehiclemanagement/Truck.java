package day15.vehiclemanagement;

public class Truck extends Vehicle{

    private double loadCapacity;
    private String weightUnit;


    public Truck(){
        this("Unknown","Unknown",0,0.0,"Unknown");
    }

    public Truck(String brand, String model, int year) {
        this(brand, model, year,0.0,"Unknown");
    }

    public Truck(String brand, String model, int year, double loadCapacity,String weightUnit) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
        this.weightUnit = weightUnit;
    }


    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf("%-15s: %.2f %s%n", "Load Capacity", this.loadCapacity,this.weightUnit);
    }

    @Override
    public void performMaintenance() {

        System.out.println("Truck has been maintenance. Check doors and neumatic");
    }
}
