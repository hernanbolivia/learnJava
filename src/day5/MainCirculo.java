package day5;

public class MainCirculo {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        double areaCirculo = circulo.calcularAreaCirculo(5.0);

        double areaTotal = areaCirculo * 5 ;
        System.out.println(areaTotal);

        areaCirculo = circulo.calcularAreaCirculo(8.0);
        areaTotal = areaCirculo * 7 ;

        System.out.println(areaTotal);
    }
}
