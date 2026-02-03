
package Herencia;

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
    }
}
