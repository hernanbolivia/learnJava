package day16;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public void makeSound() {
        System.out.println(getName() + "  says: meows, meow");
    }
}
