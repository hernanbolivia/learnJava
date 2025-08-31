package day10.exercises.ex3ex4;

public class Person {

    private String name;
    private int age;

    public Person(){
        this("Unknown", 0);
    }

    public Person(String name){
        this(name, 0);
    }


    //Constructor principal
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
        return String.format(
                "\n=========== Person Information ========\n"+
                        "%-15s: %s%n"+
                        "%-15s: %d%n"+
                        "=================================\n",
                "Name" , this.name,
                "Age", this.age
                );
    }

    public void introduceYourself(){
        System.out.println("\nHello, I'm " + this.name + " and I'm " + this.age + " years old");

    }
}
