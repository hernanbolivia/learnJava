package day20.examplecomposition1;

/**
 * Composition "has a"
 */

public class Vehicle {

    private String brand;
    private Motor motor;// this is a composition

    public Vehicle(String brand, Motor motor) {
        this.brand = brand;
        this.motor = motor;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Horse Power: " + this.motor.getHorsePower());
    }
}
