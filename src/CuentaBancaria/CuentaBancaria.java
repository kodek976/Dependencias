
package CuentaBancaria;

public class CuentaBancaria {
    //Atributos Privados
    private String titula;
    private Double saldo;
    //constructores

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titula, Double saldo) {
        this.titula = titula;
        this.saldo = saldo;
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    //Métodos propios
    public void depositar(double cantidad){
        
    }
    public boolean retirar(double cantidad){
        return true;
    }
    public String mostrainfo(){
        return"";
    }
}
