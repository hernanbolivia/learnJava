package day19.multipleimplementation;

public interface SmartDevice {

    void connectInternet ();
    void disconnectInternet();

    default void updateSoftware(){
        System.out.println("Software is updated");
    }
}
