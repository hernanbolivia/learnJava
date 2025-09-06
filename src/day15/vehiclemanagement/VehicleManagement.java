package day15.vehiclemanagement;

public class VehicleManagement {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car(
                "Toyota",
                "Corolla",
                2025,
                4);

        Vehicle vehicle2 = new Motorcycle(
                "BMW",
                "ABC",
                2020,
                false);

        Vehicle vehicle3 = new Truck(
                "Volvo",
                "TXR",
                2018,
                25.00,
                "TN");

        //Displaying information about the vehicles
        vehicle1.displayDetails();
        vehicle2.displayDetails();
        vehicle3.displayDetails();

        //Displaying maintenance information
        System.out.println("\n---------** Maintenance information **------------");
        vehicle1.performMaintenance();
        vehicle2.performMaintenance();
        vehicle3.performMaintenance();

        //Registering services
        System.out.println("\n---------** Registering services **------------");
        vehicle1.registerServices("Change oils", "Check engine light");
        vehicle2.registerServices("Checking chains", "Brake check");
        vehicle3.registerServices("Engine overhaul", "Tire change");

        //Displaying information counting about vehicles
        System.out.println("\nTotal registered vehicles: " + Vehicle.getVehicleCounter());




    }
}
