package day16;

abstract public class  Animal {

    private String name;
    private int age;


    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    //abstract methods
    abstract public void makeSound();


    //concrete methods
    public void sleep(){
        System.out.println(this.name + " is sleeping.");
    }



}
