package day3.delegacionconstructores;

public class Persona {
    
    private String nombre;
    private int edad;


    public Persona() {
        this("Desconocido", 0);
    }

    public Persona(String nombre) {
        this(nombre, 0);
    }

    public Persona (int edad){
        this("Desconocido", edad);
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
