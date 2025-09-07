package day15.zoomanagement;

public class Tiger extends Animal{

    private String species;


    public Tiger(){
        this("Unknown", 0, "Unknown");
    }

    public Tiger(String name, int age, String species){
        super(name, age);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.printf("%-20s: %s%n", "Species",this.species);
    }

    @Override
    public void makeSound(){
        System.out.println("The Tiger says: ROAR");
    }
}
