package day5;

public class Circulo {

    public double calcularAreaCirculo(double radio){
        if (radio < 0 || Double.isNaN(radio) || Double.isInfinite(radio)) {
            throw new IllegalArgumentException("El radio debe ser un número finito y no negativo. Valor recibido: " + radio);
        }
        return Math.PI * radio * radio;
    }
}
