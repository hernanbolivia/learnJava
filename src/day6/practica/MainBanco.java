package day6.practica;

public class MainBanco {
    public static void main(String[] args) {

        Banco cliente1 = new Banco("Roberto", 2000);
        Banco cliente2 = new Banco("Luz", 1000);

        cliente1.mostrarDatos();
        cliente2.mostrarDatos();

        System.out.println("\n***Aplicando cambio de tasa de interes***");
        Banco.cambiarTasaInteres(4.5);
        cliente1.mostrarDatos();
        cliente2.mostrarDatos();

    }
}
