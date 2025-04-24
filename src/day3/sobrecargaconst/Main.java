package day3.sobrecargaconst;

import day3.Persona;

public class Main {
    public static void main(String[] args) {

      //Instanciando las personas
      Persona persona1 = new Persona();
      Persona persona2 = new Persona(22);
      Persona persona3 = new Persona("Ana");

      //Imprimiendo los datos de las personas usando get

        System.out.println(
                "Persona 1: Nombre: " + persona1.getNombre() + ", Edad: " + persona1.getEdad());
        System.out.println(
                "Persona 2: Nombre: " + persona2.getNombre() + ", Edad: " + persona2.getEdad());
        System.out.println(
                "Persona 3: Nombre: " + persona3.getNombre() + ", Edad: " + persona3.getEdad());


    }
}
