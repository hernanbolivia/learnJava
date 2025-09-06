package day15.vehiclemanagement;

public class Motorcycle extends Vehicle {

    private boolean confirmHelmet;


    public Motorcycle() {
        this("Unknown", "Unknown", 0, false);
    }

    public Motorcycle(String brand, String model, int year) {
        this(brand, model, year, false);

    }

    public Motorcycle(String brand, String model, int year, boolean confirmHelmet) {
        super(brand, model, year);
        this.confirmHelmet = confirmHelmet;
    }

    //Getter and Seter
    public boolean isConfirmHelmet() {
        return confirmHelmet;
    }

    public void setConfirmHelmet(boolean confirmHelmet) {
        this.confirmHelmet = confirmHelmet;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has helmet? " + (this.confirmHelmet?"Yes":"No"));
    }


    @Override
    public void performMaintenance() {

        System.out.println("The Motorcycle is under maintenance. Verified neumatic");
    }


}
