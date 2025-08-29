package day9;

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

    /**
     * Displays the user's personal information in a structured format.
     */

    public void displayInformation(){
        System.out.printf("%-20s: %s%n", "Name",this.name);
        System.out.printf("%-20s: %d%n", "Age",this.age);
    }



}
