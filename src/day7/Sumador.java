package day7;
/*
    varargs (número variable de argumentos)
 */
public class Sumador {

    public int sumar(int... numeros){

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }
}
