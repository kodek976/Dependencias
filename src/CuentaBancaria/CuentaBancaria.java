
package CuentaBancaria;

public class CuentaBancaria {


    // atributos
    private String titular;
    private double saldo;

    // constructores, si no ponemos nada es public
    CuentaBancaria() {
        titular = "Sin nombre";
        saldo = 0.0;
    }

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // métodos propios
    public void depositar(double cantidad) {
        if (cantidad >= 0) { 
            saldo += cantidad;
        }
    }

    public boolean retirar(double cantidad) {
        double operacion = saldo - cantidad;
        if (operacion >=0 ){
            saldo -= cantidad;
            return true;
        }else // saldo negativo
            return false;
    }

    // es el método toString()
    @Override
    public String toString() {
        return "CuentaBancaria{" + "titular=" + titular + ", saldo=" + saldo + "€ }";
    }

    public String mostrarInfo() {
        return "CuentaBancaria{" + "titular=" + titular + ", saldo=" + saldo + "€ }";
    }
}

