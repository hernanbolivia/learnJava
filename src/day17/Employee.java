package day17;

abstract public class Employee {

    //Attributes
    private int id;
    private String name;
    private double basicSalary;


    //Constructor
    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }


    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }


    //Abstract methods
    abstract public double calculateSalary();

    //Concrete methods
    public void displayDetails(){
        System.out.println("\n======= Employee Details =======");
        System.out.printf("%-15s: %d%n", "Employee ID",this.id);
        System.out.printf("%-15s: %s%n", "Employee Name",this.name);
        System.out.printf("%-15s: %.2f%n", "Salary",calculateSalary());
    }


}
