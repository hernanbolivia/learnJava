package day10.exercises.ex2;

public class Calculator {




    /*
        * Method of operations: Sum, Substract, Multiply, Divide
     */
    public double sum(int number1, int number2) {
        return number1 + number2;
    }

    public double substract(int number1, int number2) {
        return number1 - number2;
    }

    public double multiply(int number1, int number2) {
        return number1 * number2;
    }

    public double divide(int number1, int number2) {
        if(number2 == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return(double) number1 / number2;


    }
}
