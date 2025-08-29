package day9;

public class Student extends Person {

    private String grade;
    private double average;


    public Student(String name, int age, String grade, double average) {
        super(name, age);
        this.grade = grade;
        this.average = average;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }


    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.printf("%-20s: %s%n", "Grade",this.grade);
        System.out.printf("%-20s: %.2f%n", "Average",this.average);
    }
}
