package day3.practica;

public class CuentaBancaria {

    //Atributos
    private String titular;
    private double balance;

    //Constructores
    public CuentaBancaria() {
        this("Desconocido" , 0.0);
    }

    public CuentaBancaria(String titular) {
        this(titular, 0.0);
    }

    public CuentaBancaria(double balance) {
        this("Desconocido", balance);
    }

    public CuentaBancaria(String titular, double balance) {
        this.titular = titular;
        this.balance = balance;
    }

    //Getter y Setter
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Métodos de comportamiento
    public void depositar(double monto) {
        if (monto > 0 ){
            this.balance += monto;
        }

    }

    public boolean retirar(double monto){
        if (monto > 0 && monto <= this.balance ){
            this.balance -= monto;
            return true;
        }
        return false;
    }

    public void mostrarDetalles(CuentaBancaria cuenta){
        System.out.printf("Titular: %-15s | Balance: $%.2f%n",
               this.titular, this.balance );
    }

}
