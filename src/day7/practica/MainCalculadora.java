package day7.practica;

public class MainCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();




        int resultadoSuma = calculadora.operacion("suma", 1, 2, 3, 4);
        System.out.println(resultadoSuma);

        int resultadoProducto = calculadora.operacion("producto", 1, 2, 3, 4);
        System.out.println(resultadoProducto);

    }
}
