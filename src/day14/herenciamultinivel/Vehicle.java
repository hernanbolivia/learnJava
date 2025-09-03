package day14.herenciamultinivel;

public class Vehicle {

    private String brand;
    private String model;


    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
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


    public void displayInformation(){
        System.out.printf("%-20s: %s%n", "Brand",this.brand);
        System.out.printf("%-20s: %s%n", "Model",this.model);
    }
}
