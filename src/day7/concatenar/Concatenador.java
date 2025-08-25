package day7.concatenar;

public class Concatenador {

    public String concatenar(String... cadenas){

        StringBuilder resultado = new StringBuilder();
        for (String cadena : cadenas) {
            resultado.append(cadena);
        }
        return resultado.toString();
    }
}
