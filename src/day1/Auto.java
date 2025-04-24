package day1;

public class Auto {

    //Atributos
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double precio;

    //Constructor
    public Auto(String marca, String modelo, int anioFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    //Getter-Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    //Métodos
    public void mostrarDetalles(){
        System.out.println("\nMarca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año de Fabricación: " + this.anioFabricacion);
        System.out.println("Precio del auto: " + this.precio + " USD");
    }
}
