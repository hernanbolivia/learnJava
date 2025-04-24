package day3;

public class Persona {


    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    public Persona(int edad) {
        this.nombre = "Desconocido";
        this.edad = edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
