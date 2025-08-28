package day8;

public class Profesor extends Persona {

    private String especialidad;
    private double salario;


    public Profesor(String nombre, int edad, String especialidad, double salario) {
        super(nombre,edad);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Salario: " + this.salario);
    }
}
