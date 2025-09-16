package day18.mathematicaloperations;

public interface MathematicalOperations {

    int sum(int a, int b);

    int subtract(int a, int b);

    default int multiply(int a, int b){
        return a*b;
    }

    static int divide(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }
}
