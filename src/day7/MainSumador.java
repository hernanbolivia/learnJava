package day7;

public class MainSumador {

    public static void main(String[] args) {

        Sumador sumador = new Sumador();

        int resultadoSuma= sumador.sumar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(resultadoSuma);

        resultadoSuma = sumador.sumar(10, 20, 30);
        System.out.println(resultadoSuma);
    }
}