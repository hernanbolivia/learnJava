package day10.exercises.ex9;

public class Dog extends Animal{

    private String dogBreed;

    public Dog(String name, int age, String dogBreed) {
        super(name, age);
        this.dogBreed = dogBreed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    @Override
    public void makeSound() {
        System.out.println("Making Sound");
        System.out.println("My dog says: Guau");
    }
}
