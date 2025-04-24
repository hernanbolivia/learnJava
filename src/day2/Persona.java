package day2;

public class Persona {

    //Atributte
    private String nombre;
    private int edad;
    private String ocupacion;


    //Constructor
    public Persona(String nombre, int edad, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    //Getter & Setter
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    //Method que imprime los datos de la persona usando printf
    /*%-10s: string alineado a la izquierda, con 10 caracteres de espacio
    %d: número entero.
    %d: número entero.
     */

    public void mostrarDetalles(){
        System.out.printf("%-10s: %s\n","Nombre", this.nombre);
        System.out.printf("%-10s: %d años\n","Edad: " , this.edad);
        System.out.printf("%-10s: %s\n","Ocupación", this.ocupacion);
        
    }

}
