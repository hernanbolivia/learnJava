package day17;

public class FullTimeEmployee extends Employee{

    private double bonus;


    public FullTimeEmployee(int id, String name, double basicSalary, double bonus) {
        super(id, name, basicSalary);
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    //Overriding method, implements abstract method from Employee class
    @Override
    public double calculateSalary() {
        return getBasicSalary() + this.bonus;
    }


}
