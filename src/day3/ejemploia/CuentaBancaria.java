package day3.ejemploia;
/**
 * Representa una cuenta bancaria básica con un titular y un balance.
 */
public class CuentaBancaria {
    // Atributos privados
    private String titular;
    private double balance;

    // Constante para titular desconocido
    private static final String TITULAR_DESCONOCIDO = "Desconocido";

    // === Constructores ===

    /**
     * Constructor por defecto. Titular desconocido y balance cero.
     */
    public CuentaBancaria() {
        this(TITULAR_DESCONOCIDO, 0.0);
    }

    /**
     * Constructor con nombre del titular.
     * @param titular Nombre del titular.
     */
    public CuentaBancaria(String titular) {
        this(titular, 0.0);
    }

    /**
     * Constructor con balance inicial.
     * @param balance Monto inicial.
     */
    public CuentaBancaria(double balance) {
        this(TITULAR_DESCONOCIDO, balance);
    }

    /**
     * Constructor con titular y balance inicial.
     * @param titular Nombre del titular.
     * @param balance Monto inicial.
     */
    public CuentaBancaria(String titular, double balance) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del titular no puede estar vacío.");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("El balance inicial no puede ser negativo.");
        }
        this.titular = titular;
        this.balance = balance;
    }

    // === Getters y Setters ===

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del titular no puede estar vacío.");
        }
        this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }

    // No se expone setBalance directamente para proteger la integridad del objeto

    // === Métodos de comportamiento ===

    /**
     * Deposita un monto positivo en la cuenta.
     * @param monto Monto a depositar.
     */
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        this.balance += monto;
    }

    /**
     * Retira un monto de la cuenta si hay suficiente saldo.
     * @param monto Monto a retirar.
     * @return true si el retiro fue exitoso; false si no hay fondos suficientes.
     */
    public boolean retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser positivo.");
        }
        if (monto > this.balance) {
            return false;
        }
        this.balance -= monto;
        return true;
    }

    /**
     * Muestra los detalles de la cuenta en consola.
     */
    public void mostrarDetalles() {
        System.out.printf("Titular: %-15s | Balance: $%.2f%n", this.titular, this.balance);
    }
}
