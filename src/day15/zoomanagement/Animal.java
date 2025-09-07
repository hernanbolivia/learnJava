package day15.zoomanagement;

public class Animal {

    private String name;
    private int age;

    private static int animalCounter = 0;

    public Animal (){
     this("Unknown", 0);
    }

    public Animal (String name, int age){
        this.name = name;
        this.age = age;
        animalCounter++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }


    public void displayInformation(){
        System.out.println("\n====== Animal Details =====");
        System.out.printf("%-20s: %s%n", "Name",this.name);
        System.out.printf("%-20s: %d%n", "Age",this.age);
    }

    public void makeSound(){
        System.out.println("The animal makes a sound");
    }

    public void registerMaintenance(String... maintenance){
        System.out.println("\nRegistered maintenance: " + getName());
        for (String item : maintenance) {
            System.out.printf("  -%-25s%n",item);
        }

    }
}
