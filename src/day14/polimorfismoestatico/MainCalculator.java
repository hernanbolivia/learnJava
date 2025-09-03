package day14.polimorfismoestatico;

public class MainCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Sum of two integers: " +calculator.sum(1,2));
        System.out.println("Sum of three integers: " +calculator.sum(1,2,3));
        System.out.println("Sum of two doubles: " +calculator.sum(1.2,2.3));
    }
}
