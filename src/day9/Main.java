package day9;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(
                "Josue",
                45);

        Student studen1 = new Student(
                "Gher",
                12,
                "3th grade",
                18);

        Teacher teacher1 = new Teacher(
                "Dylan",
                48,
                8,
                "Data Analyst","Data Engineering");

        Employee employee1 = new Employee(
                "John",
                34,
                "Dev Backend",
                "Morning");

        System.out.println("--------------------** Information about a person**");
        person1.displayInformation();
        System.out.println("--------------------** Information about a student **");
        studen1.displayInformation();
        System.out.println("--------------------** Information about a teacher **");
        teacher1.displayInformation();
        System.out.println("--------------------** Information about a employee **");
        employee1.displayInformation();

    }
}
