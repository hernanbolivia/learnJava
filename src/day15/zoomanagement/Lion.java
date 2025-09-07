package day15.zoomanagement;

public class Lion extends Animal{

    private int weight;


    public Lion() {
        this("Unknown", 0, 0);
    }

    public Lion(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.printf("%-20s: %d%n", "Weight",this.weight);
    }


    @Override
    public void makeSound(){
        System.out.println("The Lion says: Grrrrr");
    }
}
