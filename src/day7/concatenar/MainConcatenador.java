package day7.concatenar;

public class MainConcatenador {
    public static void main(String[] args) {

        Concatenador concatenador = new Concatenador();
        String texto = concatenador.concatenar("Hola",", ","Mundo");
        System.out.println(texto);
    }
}
