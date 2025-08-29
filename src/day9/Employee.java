package day9;

public class Employee extends Person{

    private String jobTitle;
    private String workShift;

    public Employee(String name, int age, String jobTitle, String workShift) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.workShift = workShift;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getWorkShift() {
        return workShift;
    }

    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.printf("%-20s: %s%n", "Job Title",this.jobTitle);
        System.out.printf("%-20s: %s%n", "Work Shift",this.workShift);
    }
}
