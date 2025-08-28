package day8;

public class Alumno extends Persona{

    private String matricula;
    private String carrera;


    public Alumno(String nombre, int edad, String matricula, String carrera){
        super(nombre,edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public Alumno (String nombre, String matricula, String carrera){
        super(nombre);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Carrera: " + this.carrera);
    }
}
