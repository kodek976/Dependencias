
package bombones;

public class Principal {
    public static void main(String[] args) {
        // Creamos Chocolate
        System.out.println("Chocolate");
        Chocolate c1 = new Chocolate("Chocolate con leche", 1.99);
        System.out.println(c1.getSabor());
        
        // Creamos un bombón
        System.out.println("Bombón 1");
        Bombon b1 = new Bombon("Rojo");
        System.out.println(b1.getColor());
        
        // Ya puedo meter en el Bombón el chocolate
        b1.setChocolate(c1);
        System.out.println(b1.getChocolate().getPrecio());
        
        // Utilizo el método encapsulado guapo
        Bombon b2 = new Bombon("Verde", "Pistacho", 2.99);
         System.out.println("Bómbon 2");
        System.out.println(b2.getColor());
        System.out.println(b2.getSabor());
        System.out.println(b2.getPrecio());
        System.out.println("Le subimos el precio...");
        b2.setPrecio(4.99);
        System.out.println(b2.getPrecio());
    }
}
