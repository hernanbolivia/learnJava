package day10.exercises.ex13;

public class Counter {

    private static int counting=0;

    //Incremented every time the class is instantiated
    public Counter() {
        counting++;
    }

    public static void displayCounting(){
        System.out.println( "Number of objects created: " + counting);
    }
}
