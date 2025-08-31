package day10.exercises.ex9;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Larry", 4);
        Cat cat = new Cat("Negra", 10, "Chora");
        Dog dog = new Dog("Beto", 1, "El rapido");

        animal.makeSound();
        cat.makeSound();
        dog.makeSound();

    }
}
