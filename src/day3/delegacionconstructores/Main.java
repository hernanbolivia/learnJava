package day3.delegacionconstructores;



public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Juan");
        Persona persona3 = new Persona(22);
        Persona persona4 = new Persona("Ana", 28);

        System.out.println(
                "El nombre persona 1 es: " + persona1.getNombre()+ ", y la edad es: " + persona1.getEdad());
        System.out.println(
                "El nombre persona 2 es: " + persona2.getNombre()+ ", y la edad es: " + persona2.getEdad());
        System.out.println(
                "El nombre persona 3 es: " + persona3.getNombre()+ ", y la edad es: " + persona3.getEdad());
        System.out.println(
                "El nombre persona 4 es: " + persona4.getNombre()+ ", y la edad es: " + persona4.getEdad());

    }
}
