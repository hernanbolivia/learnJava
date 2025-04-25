package day4;

public class Empleado {

    private String nombre;
    private int id;
    private String puesto;
    private double salarioMensual;

    // Constructor por defecto
    public Empleado() {
        this("Desconocido",0,"Desconocido", 0.0);
    }

    //Constructor con nombre
    public Empleado (String nombre){
        this(nombre,0,"Desconocido", 0.0);
    }

    //Constructor con nombre y id
    public Empleado(String nombre, int id){
        this(nombre,id,"Desconocido", 0.0);
    }

    //Constructor con nombre, id y puesto
    public Empleado(String nombre, int id, String puesto){
        this(nombre,id,puesto,0.0);
    }

    //Constructor completo
    public Empleado(String nombre, int id, String puesto, double salarioMensual) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
        this.salarioMensual = salarioMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    //Metodo para calcular el salario anual
    public double calcularSalarioAnual(){
        return this.salarioMensual * 12.0;
    }

    //Metodo para aplicar el aumento al salario
    public void aplicarAumento (double porcentaje) {
        if (porcentaje > 0) {
            this.salarioMensual += this.salarioMensual * (porcentaje / 100);
        }
    }

    //Metodo para imprimir detalles

    public void imprimirDetalles(){
        System.out.println("\n-----Detalles del empleado---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("ID: " + this.id);
        System.out.println("Puesto: " + this.puesto);
        System.out.printf("Salario mensual: %.2f\n" ,this.salarioMensual);
        System.out.printf("Salario anual: %.2f\n" , this.calcularSalarioAnual());
        System.out.println("---------------------------------");

    }





}
