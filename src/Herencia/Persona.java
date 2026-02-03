
package Herencia;

public class Persona {
    private String nombre;
    
    //Constructores

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Métodos propios
    public void andar(){
        System.out.println(nombre+" está andando a 5 Km/h");
    }

    @Override
    public String toString() {
        return "Persona{"+"nombre"+nombre+'}'   ;
    }
    
}
