package day15.vehiclemanagement;

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
}
