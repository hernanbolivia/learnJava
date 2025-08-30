package day10.exercises.ex2;

public class TestCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("==== Calculator test ======");
        System.out.println("Suma: " + calculator.sum(45, 2));
        System.out.println("Substraction: " + calculator.substract(45, 2));
        System.out.println("Multiply: " + calculator.multiply(45, 2));

        try {
            System.out.println("Division: " + calculator.divide(45, 0));
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }







    }
}
