package day19.multipleimplementation;

public class DeviceManagement {
    public static void main(String[] args) {

        SmartPhoneImpl smartPhone = new SmartPhoneImpl(
                "Apple",
                "Iphone 15",
                "Apple"
        );

        smartPhone.start();
        smartPhone.connectInternet();
        smartPhone.updateSoftware();
        smartPhone.toCharge();
        smartPhone.disconnectInternet();
        smartPhone.turnOff();

    }
}
