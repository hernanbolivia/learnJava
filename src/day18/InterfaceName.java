package day18;

public interface InterfaceName {

    int CONSTANT = 10;

    //Abstract method
    public void abstractMethod();


    //Method with behavior


    //Static Method
    public static void staticMethod(){
        System.out.println("This is a static method.");
    }

    //Default Method
    public default void defaultMethod(){
        System.out.println("This is a default method.");
    }


}
