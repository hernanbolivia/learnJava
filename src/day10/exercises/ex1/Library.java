package day10.exercises.ex1;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book(
                "Mi Planta de Naranja Lima",
                "Paulo de Bansconcelos",
                453);

        Book book2 = new Book(
                "Salvese quien pueda",
                "Hernán",
                123);

        Book book3 = new Book(
                "El gran libro de la historia",
                "Roberto",
                233);

        /*book1.displayInformation();
        book2.displayInformation();
        book3.displayInformation();*/

        System.out.println(book1);//print use toString()
        System.out.println(book2);
        System.out.println(book3);
    }
}
