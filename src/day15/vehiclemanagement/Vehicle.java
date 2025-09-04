package day15.vehiclemanagement;

public class Vehicle {

    private String brand;
    private String model;
    private int year;

    /*
    Static attributes
     */
    private static int vehicleCounter = 0;


    public Vehicle() {
        this("Unknown", "Unknown", 0);
    }

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
