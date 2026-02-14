

package CajaBombon;


import bombones.Bombon;
import java.util.ArrayList;



public class Caja {
    // Atributos
    private String material;
    
    // Tenemos muchos bombones... tipo de dato homogeneo
    private ArrayList<Bombon> bombones;
    
    // Constructores (Sobrecarga)
    // Modificamos para un uso concreto, 
    // creo una caja, instancio el ArrayList
    public Caja() {
        bombones = new ArrayList<>();
    }
    public Caja(String material) {
        this.material = material;
        bombones = new ArrayList<>();
    }     
    
    // Creamos el constructor con el nuevo atributo
    // Este me sobra... no me gusta pasar el ArrayList
    
    /*
    public Caja(String material, ArrayList<Bombon> bombones) {
        this.material = material;
        this.bombones = bombones;
    }
    */
       

    //Métodos: Getters y setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    // Creamos los getters y setters
    public ArrayList<Bombon> getBombones() {
        return bombones;
    }

    public void setBombones(ArrayList<Bombon> bombones) {
        this.bombones = bombones;
    }
    
    // Métodos propios (algunos heredados de ArrayList)
    public void addBombon(Bombon bombon){
        bombones.add(bombon);
    }
    
    // Nos insteresa también, en vez de meter un bombon ya creado
    // meter los atributos para que se cree el bombon
   
    public void addBombon(String color, String sabor, double precio){
        // Bombon b = new Bombon(color, sabor, precio);
        // bombones.add(b); // Lo meto en el ArrayList
        bombones.add(new Bombon(color, sabor, precio));
    }

    @Override
    public String toString() {
        return "Caja{" + "material=" + material + ", bombones=" + bombones + '}';
    }

}