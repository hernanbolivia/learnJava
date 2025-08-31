package day10.exercises.ex7;

/**
 * Class only operations and overload
 */
public class MathOperations {

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int multiply(int num1, int num2, int num3){
        return num1 * num2 * num3;
    }

    public int sum(String operator, int...numbers){

        int result = 0;

        if(operator.equalsIgnoreCase("sum")){
            for (int number : numbers){
                result += number;
            }

        }
        return result;

    }


}
