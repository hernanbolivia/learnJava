package day5.sobrecargametodos;
/* En esta clase se demuestra la sobrecarga de metodos */

public class Calculadora {

    //Metodo que suma dos numeros
    public int sumar(int a, int b){
        return a + b;
    }

    //Metodo que suma tres numeros
    public int sumar(int a, int b, int c){
        return a+b+c;
    }

    //Metodo que suma tres numeros double
    public double sumar(double a, double b, double c){
        return a+b+c;
    }

    //Metodo que suma dos numeros double
    public double sumar(double a, double b){
        return a+b;
    }
}
