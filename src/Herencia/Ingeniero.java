
package Herencia;

/**
 *
 * @author kodek
 */
public class Ingeniero extends Persona {

    public Ingeniero() {
    }

    public Ingeniero(String nombre) {
        super(nombre);
    }

    @Override
    public void andar(){
        System.out.println(getNombre()+" está andando a 4 Km/h");
    }
    
}
