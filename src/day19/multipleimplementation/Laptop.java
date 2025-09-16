package day19.multipleimplementation;

public interface Laptop {

    void  start();
    void  turnOff();

    default void toCharge(){
        System.out.println("Laptop is charging");

    }

}
