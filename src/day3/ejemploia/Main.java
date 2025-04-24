package day3.ejemploia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria("Luis Ramírez", 1500.00);
        CuentaBancaria cuenta2 = new CuentaBancaria("Carmen López");
        CuentaBancaria cuenta3 = new CuentaBancaria(250.50);

        int opcion = 0;

        do {
            System.out.println("\n=== Menú de operaciones ===");
            System.out.println("1. Mostrar detalles de las cuentas");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        // Mostrar detalles de todas las cuentas
                        System.out.println("\nDetalles de las cuentas:");
                        cuenta1.mostrarDetalles();
                        cuenta2.mostrarDetalles();
                        cuenta3.mostrarDetalles();
                        break;

                    case 2:
                        // Depositar dinero
                        System.out.print("\nIngrese el monto a depositar: ");
                        double montoDepositar = Double.parseDouble(scanner.nextLine());
                        System.out.println("Seleccione la cuenta para depositar:");
                        System.out.println("1. Luis Ramírez");
                        System.out.println("2. Carmen López");
                        System.out.println("3. Cuenta Desconocida");

                        int cuentaDepositar = Integer.parseInt(scanner.nextLine());

                        switch (cuentaDepositar) {
                            case 1:
                                cuenta1.depositar(montoDepositar);
                                System.out.println("Depósito realizado exitosamente.");
                                break;
                            case 2:
                                cuenta2.depositar(montoDepositar);
                                System.out.println("Depósito realizado exitosamente.");
                                break;
                            case 3:
                                cuenta3.depositar(montoDepositar);
                                System.out.println("Depósito realizado exitosamente.");
                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }
                        break;

                    case 3:
                        // Retirar dinero
                        System.out.print("\nIngrese el monto a retirar: ");
                        double montoRetirar = Double.parseDouble(scanner.nextLine());
                        System.out.println("Seleccione la cuenta para retirar:");
                        System.out.println("1. Luis Ramírez");
                        System.out.println("2. Carmen López");
                        System.out.println("3. Cuenta Desconocida");

                        int cuentaRetirar = Integer.parseInt(scanner.nextLine());

                        switch (cuentaRetirar) {
                            case 1:
                                if (cuenta1.retirar(montoRetirar)) {
                                    System.out.println("Retiro realizado exitosamente.");
                                } else {
                                    System.out.println("No hay suficiente saldo.");
                                }
                                break;
                            case 2:
                                if (cuenta2.retirar(montoRetirar)) {
                                    System.out.println("Retiro realizado exitosamente.");
                                } else {
                                    System.out.println("No hay suficiente saldo.");
                                }
                                break;
                            case 3:
                                if (cuenta3.retirar(montoRetirar)) {
                                    System.out.println("Retiro realizado exitosamente.");
                                } else {
                                    System.out.println("No hay suficiente saldo.");
                                }
                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }
                        break;

                    case 4:
                        System.out.println("Gracias por usar nuestros servicios. ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción correcta.");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Por favor ingrese un número.");
            }

        } while (opcion != 4); // Continuar hasta que el usuario elija salir

        scanner.close();
    }



}
