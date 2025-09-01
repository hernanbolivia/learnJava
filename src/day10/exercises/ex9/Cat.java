package day10.exercises.ex9;

public class Cat extends Animal {

    private String sobriquet;

    public Cat(String name, int age, String species, String sobriquet) {
        super(name, age, species);
        this.sobriquet = sobriquet;
    }

    public String getSobriquet() {
        return sobriquet;
    }

    public void setSobriquet(String sobriquet) {
        this.sobriquet = sobriquet;
    }

    @Override
    public void makeSound() {

        System.out.println("my cat "+ getName()+" says: Miauuu");
    }


}
