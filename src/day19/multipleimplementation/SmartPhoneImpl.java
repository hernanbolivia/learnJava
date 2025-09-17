package day19.multipleimplementation;

public class SmartPhoneImpl implements Laptop, SmartDevice{


    private String brand;
    private String model;
    private String manufacturer;


    public SmartPhoneImpl(String brand, String model, String manufacturer) {
        this.brand = brand;
        this.model = model;
        this.manufacturer = manufacturer;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    @Override
    public void start() {
        System.out.println(
                this.brand + " " + this.model + " " + this.manufacturer + " is starting");

    }

    @Override
    public void turnOff() {
        System.out.println(
                this.brand + " " + this.model + " " + this.manufacturer + " is turning off");

    }

    @Override
    public void connectInternet() {
        System.out.println(
                this.brand + " " + this.model + " " + this.manufacturer + " is connecting to the internet");

    }

    @Override
    public void disconnectInternet() {
        System.out.println(
                this.brand + " " + this.model + " " + this.manufacturer + " is disconnecting from the internet");

    }
}
