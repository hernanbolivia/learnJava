package day14.polimorfismodinamico;

public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Developer();
        Employee employee3 = new Manager();

        employee1.Work();
        employee2.Work();
        employee3.Work();
    }
}
