package day15.zoomanagement;

public class ZooManagement {
    public static void main(String[] args) {

        Animal animal1 = new Lion("Riku",4,1);
        Animal animal2 = new Elephant("MAi",12,"Male");
        Animal animal3 = new Tiger("Ryu",15,"Minusiph");

        animal1.displayInformation();
        animal2.displayInformation();
        animal3.displayInformation();

        System.out.println("\n==== Animal Sounds ====");
        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();

        System.out.println("\n====Registering maintenance ====");
        animal1.registerMaintenance("Check for injuries. Inspection of cage doors");
        animal2.registerMaintenance("Check for injuries. Infrastructure replacement.");
        animal3.registerMaintenance("Check for injuries. Full bathroom.");

        System.out.println("Total registered animals: " + Animal.getAnimalCounter());




    }
}
