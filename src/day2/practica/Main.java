package day2.practica;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro(
                "Los Ojos de mi princesa",
                "José Carlos Cautemoc",
                1937,
                12.50);

        Libro libro2 = new Libro(
                "The Hobbit",
                "Robert Hatt",
                2012,
                15.50);

        Libro libro3 = new Libro(
                "Y tu mamá también",
                "Hernán Bolivia",
                2019,
                10.50);

        //Mostrar los datos de los libros

        System.out.println("\n======DETALLES DEL LIBRO 1 ======");
        libro1.mostrarDetalles();
        System.out.println("===================================\n");

        System.out.println("\n======DETALLES DEL LIBRO 2 ======");
        libro2.mostrarDetalles();
        System.out.println("===================================\n");

        System.out.println("\n======DETALLES DEL LIBRO 3 ======");
        libro3.mostrarDetalles();
        System.out.println("===================================\n");
    }
}
