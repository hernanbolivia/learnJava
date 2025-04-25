package day5.sobrecargametodos;

public class MainCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();


        System.out.println("La suma de tres números:" + calculadora.sumar(1.2, 2, 3));
        System.out.println("La suma de dos números:" + calculadora.sumar(1, 2));
    }
}
