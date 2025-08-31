package day10.exercises.ex9;

public class Cat extends Animal {

    private String sobriquet;

    public Cat(String name, int age, String sobriquet) {
        super(name, age);
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
        System.out.println("Making Sound");
        System.out.println("my cat says: Miauuu");
    }
}
