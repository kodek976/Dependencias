

package CajaBombon;

import bombones.Bombon;
import java.util.ArrayList;

public class Caja {
     //Atributos
    private String material;
    // Tenemos muchos bombones... tipo de dato homogeneo, Lo cogemos del ejercicio de Bombon 
    private ArrayList<Bombon> bombones;
    //Constructores
    public Caja() {
    }
     
    public Caja(String material) {
        this.material = material;
    }
    //Nuevos constructores

    public Caja(String material, ArrayList<Bombon> bombones) {
        this.material = material;
        this.bombones = bombones;
    }
    
    //Getters y Setters

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    //Creamos Getters y Setters nuevos

    public ArrayList<Bombon> getBombones() {
        return bombones;
    }

    public void setBombones(ArrayList<Bombon> bombones) {
        this.bombones = bombones;
    }
    
}
