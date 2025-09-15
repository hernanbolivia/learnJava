package day18.mathematicaloperations;

public class Main {
    public static void main(String[] args) {

        CalculatorImpl calculator = new CalculatorImpl();

        System.out.println("Sum of two integers: " +calculator.sum(1,2));
        System.out.println("Subtraction of two integers: " + calculator.subtract(4,5));
        System.out.println("Multiplication of two integers: " + calculator.multiply(6,7));
        System.out.println("Divide of two integers: " + MathematicalOperations.divide(24,3));
    }
}
