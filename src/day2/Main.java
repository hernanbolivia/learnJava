package day2;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona(
                "Juan",
                18,
                "Arquitecto");

        Persona persona2 = new Persona(
                "Pedro",
                25,
                "Ingeniero de Sistemas");

        Persona persona3 = new Persona(
                "Hernán",
                18,
                "Estudiante");

        // Mostrar los datos de las personas

        System.out.println("\n======DETALLES DE LA PERSONA 1 ======");
        persona1.mostrarDetalles();
        System.out.println("=======================================\n");

        System.out.println("\n======DETALLES DE LA PERSONA 2 ======");
        persona2.mostrarDetalles();
        System.out.println("=======================================\n");

        System.out.println("\n======DETALLES DE LA PERSONA 3 ======");
        persona3.mostrarDetalles();
        System.out.println("=======================================\n");
    }
}
