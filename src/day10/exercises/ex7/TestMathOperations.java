package day10.exercises.ex7;


import static day10.exercises.ex7.MathOperations.multiply;

public class TestMathOperations {
    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();

        int product = multiply(6,7);
        int product1 = multiply(6,7,10);

        System.out.printf("6 * 7 = %d%n", product);
        System.out.printf("6 * 7 * 10 = %d%n", product1);

        int resultSum = mathOperations.sum("Sum", 8, 7);
        System.out.printf("Sum of 8 & 7 = %d%n", resultSum);


    }
}
