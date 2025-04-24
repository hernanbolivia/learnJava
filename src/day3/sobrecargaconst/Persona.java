package day3.sobrecargaconst;

public class Persona {

    //Atributos
    private String nombre;
    private int edad;

    //Contructor por defecto
    public Persona() {
        this("Desconocido",0);
    }

    //Constructor con 1 parametro (String)
    public Persona(String nombre){
        this(nombre,0);
    }

    //Constructor con 1 parametro (int)
    public Persona(int edad){
        this("Desconocido",edad);
    }

    //Constructor con 2 parametros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Get
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
