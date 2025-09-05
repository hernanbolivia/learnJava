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
        vehicleCounter++;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Static method
    public static int getVehicleCounter() {
        return vehicleCounter;
    }

    //Behavioral methods
    public void displayDetails() {
        System.out.println("\n======= Vehicle Details =======");
        System.out.printf("%-15s: %s%n", "Brand", this.brand);
        System.out.printf("%-15s: %s%n", "Model", this.model);
        System.out.printf("%-15s: %d%n", "Year", this.year);
    }


    public void performMaintenance(){
        System.out.println("The vehicle is under maintenance");
    }

    /*
        Method with varargs
     */
    public void registerServices(String... services){
        System.out.println("Registered services:");
        for(String service: services){
            System.out.printf("- %s%n " ,service);
        }

    }






}
