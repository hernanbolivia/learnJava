package day5.ejemplo2;

public class Main {
    public static void main(String[] args) {

        Texto texto = new Texto();

        String textoConvertido = texto.convertirAMayusculas("hola mundo");
        System.out.println(textoConvertido);

        textoConvertido += "-";
        System.out.println(textoConvertido);
    }
}
