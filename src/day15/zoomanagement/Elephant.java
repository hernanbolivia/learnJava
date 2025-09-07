package day15.zoomanagement;

public class Elephant extends Animal{

    private String gender;


    public Elephant(){
        this("Unknown", 0, "Unknown");
    }


    public Elephant(String name, int age, String gender){
        super(name, age);
        this.gender = gender;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.printf("%-15s: %s%n", "Gender",this.gender);
    }

    @Override
    public void makeSound(){
        System.out.println("The Elephant says: RRRRRRRRRRR");
    }
}
