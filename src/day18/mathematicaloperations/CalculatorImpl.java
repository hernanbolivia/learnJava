package day18.mathematicaloperations;

public class CalculatorImpl implements MathematicalOperations{

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
