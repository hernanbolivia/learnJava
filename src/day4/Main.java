package day4;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(
                "Hernán",
                1,
                "Asistente de ventas",
                2150.00);

        empleado1.mostrarDetalles();

        empleado1.setSalarioMensual(3500);//Aumento del Salario
        System.out.println("\nDetalles después del aumento");
        empleado1.mostrarDetalles();

        //Aplicando aumento del 10%
        double nuevoSalario = empleado1.aplicarAumento(10);
        System.out.println("\nNuevo salario después del aumento 10%: $" + nuevoSalario);

    }
}
