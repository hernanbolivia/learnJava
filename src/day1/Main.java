package day1;

public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto(
                "Nissan",
                "Fala",
                2023,
                45120.25);


        Auto auto2 = new Auto(
                "Toyota",
                "Corolla",
                2020,
                35000.00);

        auto1.mostrarDetalles();
        auto2.mostrarDetalles();
        System.out.println("--------");

        //Implementando Getter
        System.out.println(auto1.getPrecio());
        auto1.setPrecio(20000.00);
        System.out.println(auto1.getPrecio());


    }
}
