package day7.practica;

public class Calculadora {

    public int operacion(String operador, int... numeros) {

        int resultadoOperacion = 0;

        if (operador.equalsIgnoreCase("suma")) {
            for (int i = 0; i < numeros.length; i++) {
                resultadoOperacion += numeros[i];
            }
            return resultadoOperacion;
        } else if (operador.equalsIgnoreCase("producto")) {
            resultadoOperacion = 1;

            for (int num : numeros) {
                resultadoOperacion *= num;
            }
            return resultadoOperacion;

        }

        return resultadoOperacion;
    }

}





