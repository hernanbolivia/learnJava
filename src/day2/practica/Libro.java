package day2.practica;

public class Libro {
    //Atributos

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private double precio;

    //Constructor
    public Libro(String titulo, String autor, int anioPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }

    //Getter & Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo mostrar detalles
    public void mostrarDetalles(){

        System.out.printf("%-20s: %s\n","Titulo",this.titulo);
        System.out.printf("%-20s: %s\n","Autor",this.autor);
        System.out.printf("%-20s: %d\n","Año de publicación",this.anioPublicacion);
        System.out.printf("%-20s: $%.2f usd\n","Precio",this.precio);
    }

}
