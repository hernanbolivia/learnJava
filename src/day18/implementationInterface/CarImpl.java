package day18.implementationInterface;

public class CarImpl implements Vehicle{

    //Attributes
    private int velocity;

    @Override
    public void move() {
        System.out.println("The car is moving");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopped");
    }

    @Override
    public void accelerate(int increase) {
        this.velocity += increase;
        System.out.println("The car is accelerating: " + this.velocity + " km/h");

    }

    @Override
    public void brake() {
        System.out.println("The car is braking");

    }
}
