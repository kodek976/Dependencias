
package Herencia;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Construimos una persona
        Persona p1 = new Persona("Álvaro");
        //Visualizamos su nombre
        System.out.println(p1.getNombre());
        //construimos un deportista
        Deportista d1 = new Deportista();
        d1.setNombre("Cristiano");
        //Aparece el método de persona
        d1.setDeporte("Campeón en goles");
        //Deportista hereda los métodos de persona
        System.out.println(d1.getNombre()+" "+d1.getDeporte());
        
        
       //Sobrecarga Dinámica
       p1.andar();
       d1.andar();
       
       //toString()
        System.out.println(p1);
        System.out.println(d1);
        
       //Super()
       Deportista d2 = new Deportista("Curling","el momo");
        System.out.println(d2);
        
       //Polimorfismo y encapsulación 
       Persona p3 = new Deportista ("Abuelillo");
       p3.andar();
       Persona p4 = new Ingeniero("Elon musk");
       p4.andar();
       
       //ArrayList de personas todas andan
        System.out.println("ArrayList de personas");
        ArrayList<Persona> personas= new ArrayList();
        personas.add(p1);
        //personas.add(p1);
        personas.add(p3);
        personas.add(p4);
        
        for (Persona p : personas) {
            p.andar();
        }
              // Casting 
        // Persona es un Deportista y quiero acceder a sus métodos
        System.out.println("CASTING");
        Persona p5 = new Deportista("Tenis","Rafa");
        p5.andar();
        //Asignar un deporte... trabajar con el Objeto Deportista
        p5.getNombre(); // Solo tengo eso
        Deportista d3 = (Deportista) p5;
        System.out.println(d3.getDeporte()); 
        // Ya aparece el otro método getDeporte()
    }
}
