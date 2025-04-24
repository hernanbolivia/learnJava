package day3;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona ("Carlos");
        Persona persona2 = new Persona (22);
        Persona persona3 = new Persona ("Elena", 28);


        System.out.println(
                "\nPersona 1: Nombre: " + persona1.getNombre() + " Edad: " + persona1.getEdad());

        System.out.println(
                "Persona 2: Nombre: " + persona2.getNombre() + " Edad: " + persona2.getEdad());

        System.out.println(
                "Persona 3: Nombre: " + persona3.getNombre() + " Edad: " + persona3.getEdad());


    }
}
