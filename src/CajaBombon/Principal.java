

package CajaBombon;

import bombones.Bombon;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Construimos una caja  
        Caja c1 = new Caja ("Cartón");
        System.out.println(c1.getMaterial());
        
        // Trabajar con la clase... mal
        // Creamos dos bombones
        Bombon b1 = new Bombon("Rojo","Chocolate con leche",1.99);
        Bombon b2 = new Bombon("Verde", "Pistacho", 4.99);
        
        // Creamos el arrayList de los bombones
        ArrayList<Bombon> bbnes = new ArrayList<>();
        bbnes.add(b1);
        bbnes.add(b2);
        
        // Le asociadmos el arrayList con setBombones
        c1.setBombones(bbnes);
        
        // Ya tenemos la case construida... 
        // Si quiero añadir un bombón nuevo
        Bombon b3 = new Bombon("Negro", "Chocolate negro", 3.99);
        System.out.println("Sabor de los bombones:");
        c1.getBombones().add(b3);
        for (Bombon bombone : c1.getBombones()) {
            System.out.println(bombone.getSabor());
        }
        
        // No nos gusta....
    }
}
