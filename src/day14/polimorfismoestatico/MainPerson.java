package day14.polimorfismoestatico;

public class MainPerson {
    public static void main(String[] args) {

        Person person1 = new Person(
                "Juan",
                22);

        Person person2 = new Person(
                "Pedro",
                28);

        Person person3 = new Person();

        Person person4 = new Person(
                23);

        Person person5 = new Person(
                "Juan");

        Person person6 = new Person();


        person1.displayInformation();
        person2.displayInformation();
        person3.displayInformation();
        person4.displayInformation();
        person5.displayInformation();
        person6.displayInformation();



    }
}
