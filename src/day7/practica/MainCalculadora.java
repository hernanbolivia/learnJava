package day7.practica;

public class MainCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.operacion("suma", 1, 2, 3, 4);
        calculadora.operacion("producto",2, 3);

    }
}
