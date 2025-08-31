package day10.exercises.ex3ex4;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Juan");
        Person person1 = new Person("Hernán",34);
        Person person2 = new Person();

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);

        person1.introduceYourself();
        person2.introduceYourself();
    }
}
