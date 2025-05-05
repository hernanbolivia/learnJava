package day6.metodosestaticos;

public class MainCalculadora {
    public static void main(String[] args) {

        int resultadoSuma = Calculadora.sumar(5, 2);
        int resultadoResta = Calculadora.restar(7, 2);
        int resultadoMultiplicacion = Calculadora.multiplicar(5, 2);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicacion: " + resultadoMultiplicacion);

        System.out.println("Es todo por ahora");


    }
}
