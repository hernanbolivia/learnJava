package day6.practica;

/* Es una practica para sintetizar el tema de atributos y metodos
estaticos
 */

public class Banco {

    //Atributos estaticos
    private static double tasaInteres = 3.5;


    // atributos

    private String nombreClientes;
    private double saldo;

    //Constructores
    public Banco(String nombreClientes, double saldo) {
        this.nombreClientes = nombreClientes;
        this.saldo = saldo;
    }

    //Metodo estatico
    public static void cambiarTasaInteres(double nuevaTasa){
        tasaInteres = nuevaTasa;
    }

    public void mostrarDatos(){
        System.out.println("\nCliente: " + this.nombreClientes);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Tasa de Interés: " + tasaInteres );
    }

}
