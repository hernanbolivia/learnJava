package day8;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", 12);
        Alumno alumno1 = new Alumno("Luis","A452","Administración");
        Profesor profesor = new Profesor("Rodolfo",45,"Fronted",7000.50);


        persona.mostrarInformacion();
        alumno1.mostrarInformacion();
        profesor.mostrarInformacion();




    }
}
