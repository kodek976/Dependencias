
package Termostato;

public class Principal {
    public static void main(String[] args) {
         //Crear un termostato usando el constructor por defecto. Crear otro usando el constructor con parámetros.
    Termostato t1 = new Termostato();
    Termostato t2 = new Termostato(18.0, 23.0);
    
    //Mostrar el estado de ambos.
        System.out.println(t1.mostrarEstado());
        System.out.println(t2.mostrarEstado());
        
      //Subir y bajar la temperatura
        System.out.println("Subimos 4,5 grados del termostato 1");
      t1.subirTemperatura(4.5);
        System.out.println("Actualización del termostato 1:"+t1.mostrarEstado());
      System.out.println("Bajamos 10 grados del termostato 2");
      t2.bajarTemperatura(10.0);
      System.out.println("Actualización del termostato 2:"+t2.mostrarEstado());
      
      //Comprobar si se ha alcanzado la temperatura objetivo.
        if (t1.estaEnObjetivo()) {
            System.out.println("Se ha alcanzado al temperatura objetivo en el primer termostato");
        }else{
            System.out.println("No se ha alcanzado la temperatura objetivo:(");
        }
        if (t2.estaEnObjetivo()) {
            System.out.println("Se ha alcanzado al temperatura objetivo");
        }else{
            System.out.println("No se ha alcanzado la temperatura objetivo en el segundo termostato`_´");
        }
      
      //Mostrar el estado final
      System.out.println("t1");
      System.out.println(t1.mostrarEstado());
      System.out.println("t2");
      System.out.println(t2.mostrarEstado());
    } 
}
