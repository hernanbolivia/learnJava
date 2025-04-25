package day4.practica;

import org.w3c.dom.ls.LSOutput;

public class MainProducto {
    public static void main(String[] args) {

        //Instanciando
        Producto producto1 = new Producto(
                "Mouse",
                1,
                "Computo",
                25.25);

        Producto producto2 = new Producto(
                "Teclado",
                2,
                "Computo");

        Producto producto3 = new Producto(
                "Monitor",
                3);

        Producto producto4 = new Producto(
                "Impresora");

        Producto producto5 = new Producto();

        //Imprimiendo los detalles

        producto1.imprimirDetalles();
        producto2.imprimirDetalles();
        producto3.imprimirDetalles();
        producto4.imprimirDetalles();
        producto5.imprimirDetalles();

        //aplicando impuesto
        System.out.println("\n====Aplicando impuesto=====");
        System.out.println("Precio base: " + producto1.getPrecio());
        producto1.calcularPrecioConImpuestos(18.0);
        producto1.imprimirDetalles();

        System.out.println("\n====Aplicando descuento=====");
        producto1.aplicarDescuento(10.0);
        producto1.imprimirDetalles();
    }




}
