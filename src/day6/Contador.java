package day6;

public class Contador {

    public static int contador = 0;

    public Contador () {

        contador ++;

    }

    public void mostrarContador(){
        System.out.println("Instancias totales: " + contador);
    }
}
