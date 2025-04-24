package day3.practica;

public class MainCuentas {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("Juan Perez");
        CuentaBancaria cuenta3 = new CuentaBancaria("Ana Gomez", 500.0);


        //Detalles de cada cuenta
        System.out.println("\n====Detalles iniciales de las cuentas=====");
        cuenta1.mostrarDetalles(cuenta1);
        cuenta2.mostrarDetalles(cuenta2);
        cuenta3.mostrarDetalles(cuenta3);

        //Operaciones en las cuentas
        cuenta2.depositar(200.0);
        cuenta3.depositar(100.0);

        //Detalle en la cuenta después de las operaciones
        System.out.println("\n====Detalles después de las operaciones====");
        cuenta1.mostrarDetalles(cuenta1);
        cuenta2.mostrarDetalles(cuenta2);
        cuenta3.mostrarDetalles(cuenta3);


    }
}
