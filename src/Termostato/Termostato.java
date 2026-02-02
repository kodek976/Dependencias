
package Termostato;

public class Termostato {
    private double temperaturaActual;
    private double temperaturaObjetivo;
    
    //constructores

    public Termostato() {
        temperaturaActual=20.0;
        temperaturaObjetivo=22.0;
    }

    public Termostato(double temperaturaActual, double temperaturaObjetivo) {
        this.temperaturaActual = temperaturaActual;
        this.temperaturaObjetivo = temperaturaObjetivo;
    }
    
    //Encapsulación: Getters y Setters(temperaturaActual sin setters solo cambia mediante métodos)

    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    public double getTemperaturaObjetivo() {
        return temperaturaObjetivo;
    }

    public void setTemperaturaObjetivo(double temperaturaObjetivo) {
        this.temperaturaObjetivo = temperaturaObjetivo;
    }
    
    //Métodos propios
    public void subirTemperatura(double grados){
        if (grados>0) {
            temperaturaActual+=grados;
        }
    } 
    public void bajarTemperatura(double grados){
        double operacion = temperaturaActual-grados;
        if (grados>=0) {
           temperaturaActual= operacion;
        }
    }
    public boolean estaEnObjetivo(){
        if (temperaturaActual>=temperaturaObjetivo) {
            return true;
        }else
        return false;
    }

    public String mostrarEstado() {
        return "Temperatura actual:"+temperaturaActual+" , temperatura objetivo:"+temperaturaObjetivo;
    }
    
}