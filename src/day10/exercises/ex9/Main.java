package day10.exercises.ex9;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Larry", 4,"todas");
        Cat cat = new Cat("Negra", 10, "Cat","Negra");
        Dog dog = new Dog("Beto", 1, "Dog","Brown");


        cat.makeSound();
        dog.makeSound();

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(animal);


    }
}
