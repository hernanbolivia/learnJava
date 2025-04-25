package day6;

public class Contador {

    //atributo estatico
    private static int contador = 0;

    public Contador (){
        contador++; //incrementa el contador 1 en 1
    }

    //metodo estatico
    public void mostrarContador(){
        System.out.println("Instancias Totales: " + contador);
    }
}
