package day14.polimorfismoestatico;
/*
 * Polimorfismo en tiempo de compilation - static po
 */
public class Person {

    private String name;
    private int age;


    public Person(){
        this("Unknown", 0);
    }

    public Person(int age){
        this("Unknown", age);
    }

    public Person (String name){
        this(name, 0);

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInformation(){
        System.out.println("\n==========Information of Person===========");
        System.out.printf("%-20s: %s%n", "Name",this.name);
        System.out.printf("%-20s: %d%n", "Age",this.age);
    }
}
