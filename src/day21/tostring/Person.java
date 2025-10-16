package day21.tostring;

public class Person {

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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


    @Override
    public String toString() {
        System.out.println("\n====== Person Details =====");
        return "Name: " + this.name + "\nAge: " + this.age;
    }


}
