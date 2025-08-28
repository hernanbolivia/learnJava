package day8;

public class Persona {

    private String nombre;
    private int edad;



    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this(nombre, 0);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void mostrarInformacion(){
        System.out.println("\nNombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }


}
