package day9;

public class Teacher extends Person{

    private String []specialties;
    private int yearsOfExperience;

    public Teacher(String name, int age, int yearsOfExperience, String... specialties) {
        super(name, age);
        this.yearsOfExperience = yearsOfExperience;
        this.specialties = specialties;
    }

    public String[] getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String[] specialties) {
        this.specialties = specialties;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.printf("%-12s: %s%n", "Years of Experience",this.yearsOfExperience);
        System.out.printf("%-12s: %s%n", "Specialties",String.join(", ",this.specialties ));
    }
}
