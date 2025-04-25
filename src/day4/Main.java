package day4;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(
                "Hernán",
                1,
                "Asistente de ventas",
                2150.00);

        Empleado empleado2 = new Empleado(
                "Luis",
                2,
                "Desarrollador Backend",
                4520);

        Empleado empleado3 = new Empleado(
                "Juan Perez");

        Empleado empleado4 = new Empleado();

        Empleado empleado5 = new Empleado(
                "Luz",
                3,
                "Diseñadora",
                4896);


        empleado1.imprimirDetalles();
        empleado2.imprimirDetalles();
        empleado3.imprimirDetalles();
        empleado4.imprimirDetalles();
        empleado5.imprimirDetalles();

        //Aplicando aumento y mostrando resultado

        System.out.println("\n====Aumento de salario=====");
        System.out.println("Aplicando 10% de aumento al salario de Luis:");
        empleado2.aplicarAumento(10.0);
        empleado2.imprimirDetalles();


    }
}


