package day10.exercises.ex9;

public class Animal {

    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void makeSound(){
        System.out.println("\nMaking Sound");
    }

    @Override
    public String toString() {
        return String.format(
                "\n=========== Animal Information ========\n"+
                        "%-15s: %s%n"+
                        "%-15s: %d%n"+
                        "%-15s: %s%n",
                "Name", this.name,
                "Age", this.age,
                "Species", this.species
        );
    }
}
