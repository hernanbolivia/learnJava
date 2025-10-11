package day21;

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


    public void displayDetails(){
        System.out.println("\n====== Person Details =====");
        System.out.printf("%-12s: %s%n", "Name",this.name);
        System.out.printf("%-12s: %d%n", "Age",this.age);
    }
}
