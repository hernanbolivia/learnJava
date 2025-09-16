package day19.multipleimplementation;

public class SmartPhone {


    private String brand;
    private String model;
    private String manufacturer;


    public SmartPhone(String brand, String model, String manufacturer) {
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
}
