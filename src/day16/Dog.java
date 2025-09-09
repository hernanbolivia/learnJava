package day16;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    /*
        In subclasses, the method abstract is a contract that must be implemented.
     */
    //Implementation of method abstract in class Dog
    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says: Woof!");
    }


}
