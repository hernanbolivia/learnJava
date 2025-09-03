package day14.herenciamultinivel;

public class Car  extends Vehicle{

    private int numberOfSeats;


    public Car(String brand, String model, int numberOfSeats) {
        super(brand, model);
        this.numberOfSeats = numberOfSeats;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.printf("%-20s: %d%n", "Number of Seats",this.numberOfSeats);
    }
}
