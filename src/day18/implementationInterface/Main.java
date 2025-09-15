package day18.implementationInterface;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new CarImpl();

        car.move();
        car.accelerate(15);
        car.stop();
        car.brake();


    }
}
