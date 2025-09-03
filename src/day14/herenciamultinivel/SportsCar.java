package day14.herenciamultinivel;
/*
* Subclass derived from Car
 */
public class SportsCar extends Car {

    private double maxSpeed;

    public SportsCar(String brand, String model, int numberOfSeats, double maxSpeed) {
        super(brand, model, numberOfSeats);
        this.maxSpeed = maxSpeed;
    }


    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.printf("%-20s: %s%n", "Max Speed",this.maxSpeed);
    }
}
