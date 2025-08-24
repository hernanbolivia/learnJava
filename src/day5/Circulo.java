package day5;

public class Circulo {

    /**
     * Calcula el área de un círculo dado su radio.
     *
     * @param radio radio del círculo; debe ser un número finito y no negativo.
     * @return área del círculo.
     * @throws IllegalArgumentException si el radio es negativo, NaN o infinito.
     */
    public double calcularAreaCirculo(double radio){
        if (radio < 0 || Double.isNaN(radio) || Double.isInfinite(radio)) {
            throw new IllegalArgumentException("El radio debe ser un número finito y no negativo. Valor recibido: " + radio);
        }
        return Math.PI * radio * radio;
    }
}
