package day20.examplecomposition1;

public class Main {
    public static void main(String[] args) {

        Motor motorXv2 = new Motor("120", "F-150");

        Vehicle vehicle1 = new Vehicle ("BMW", motorXv2);
        System.out.println("Details of the vehicle:");
        vehicle1.displayDetails();

    }
}
