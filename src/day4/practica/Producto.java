package day4.practica;

public class Producto {

    //Atributos
    private String nombre;
    private int codigo;
    private String categoria;
    private double precio;

    //Constructor con valores predeterminados
    public Producto(){
        this("Desconocido",0,"Desconocido",0);
    }

    //Constructor con únicamente nombre del producto
    public Producto(String nombre){
        this(nombre,0,"Desconocido",0);
    }

    //Constructor con nombre y codigo del producto
    public Producto(String nombre, int codigo){
        this(nombre,codigo,"Desconocido",0);
    }

    //Constructor con nombre, codigo y categoria
    public Producto(String nombre, int codigo, String categoria){
        this(nombre,codigo,categoria,0);
    }

    //Constructor completo
    public Producto(String nombre, int codigo, String categoria, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo para calcular el precio con impuestos
    public void  calcularPrecioConImpuestos(double porcentajeImpuesto){
        if(porcentajeImpuesto >0) {
            this.precio += this.precio * (porcentajeImpuesto/100);
        }
    }

    //Metodo para aplicar descuento del precio
    public void aplicarDescuento(double porcentaje){
        if (porcentaje > 0){
            this.precio -= this.precio * (porcentaje / 100);
        }
    }

    //Metodo para imprimir detalles
    public void imprimirDetalles(){
        System.out.println("\n----- Detalles del Producto -----");
        System.out.printf("Nombre               : %s%n", this.nombre);
        System.out.printf("Código               : %s%n", this.codigo);
        System.out.printf("Categoría            : %s%n", this.categoria);
        System.out.printf("Precio               : $%.2f%n", this.precio);
        System.out.println("---------------------------------");
    }
}
