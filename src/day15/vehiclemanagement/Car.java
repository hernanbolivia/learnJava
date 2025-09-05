package day15.vehiclemanagement;

import java.beans.ConstructorProperties;

public class Car extends Vehicle{

    private int numberOfSeats;


    public Car (){
        this("Unknown", "Unknown", 0,0);
    }


    public Car(String brand, String model, int year) {
        this(brand, model, year, 0);

    }

    public Car(String brand, String model, int year, int numberOfSeats) {
        super(brand, model, year);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.printf("%-15s: %d%n", "Number Of Seats", this.numberOfSeats);
    }

    @Override
    public void performMaintenance(){
        super.performMaintenance();
        System.out.println("The vehicle is under maintenance. Chek doors");
    }


}
