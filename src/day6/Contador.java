package day6;

public class Contador {

    // Atributos
    private static int contador = 0;

    public Contador () {
        contador++;
    }

    public void mostrarContador(){
        System.out.println("Instanias Totales: " + contador);
    }



}
