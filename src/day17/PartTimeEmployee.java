package day17;

public class PartTimeEmployee extends  Employee {

    //Attributes
    private int workHours;
    private double hourlyRate;


    //constructor
    public PartTimeEmployee(int id, String name, double basicSalary, int workHours, double hourlyRate) {
        super(id, name, basicSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }


    //Getter & Setter
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    @Override
    public double calculateSalary() {
        return getBasicSalary()+ (this.workHours * this.hourlyRate);
    }
}
