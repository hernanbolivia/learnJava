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

    //Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }else{
                throw new IllegalArgumentException("El nombre no puede ser vacío o nulo");

            }
        }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0) { //El Id debe ser mayor a 0
            this.id = id;
        }else{
            throw new IllegalArgumentException("El id debe ser mayor a 0");
        }

    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if(puesto != null && !puesto.trim().isEmpty()) {
            this.puesto = puesto;
        }else{
            throw new IllegalArgumentException("El puesto no puede ser vacío o nulo");
        }

    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if(salarioMensual >= 0) {
            this.salarioMensual = salarioMensual;
        }else{
            throw new IllegalArgumentException("El salario mensual no puede ser negativo");
        }


    }


    //Metodo para calcular el salario anual
    public double calcularSalarioAnual(){
        return this.salarioMensual * 12.0;
    }

    //Metodo para aplicar el aumento al salario
    public double aplicarAumento (double porcentaje){
        if(porcentaje < 0){
            throw new IllegalArgumentException("El porcentaje no puede ser negativo");
        }
        return this.salarioMensual * (1.0 + porcentaje / 100.0);
    }

    //Sobrescritura de Tostring() para proporcionar detalles del empleado
    @Override
    public String toString() {
       return String.format("Nombre: %s\nId: %d\nPuesto: %s\nSalario mensual: %.2f\nSalario anual: %.2f",
               this.nombre, this.id, this.puesto, this.salarioMensual, this.calcularSalarioAnual());
    }

    //Metodo para mostrar los detalles del empleado
    public void mostrarDetalles(){
        System.out.println(this.toString());
    }
}
