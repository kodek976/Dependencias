
package Biblioteca;

public class Principal {
public static void main(String[] args) {
    Libro l1 = new Libro();
    System.out.println(l1);
    
    Libro l2 = new Libro("Mortadelo y Filemón", "Ibañez", 1998);
    String Descripcion = l2.toString();  // ? Cambio de tostring a toString
    System.out.println(Descripcion);     // ? Agregar esta línea para ver la descripción
    l2.mostrarAutor();
    
    LibroDeFiccion l3 = new LibroDeFiccion("Ficción", "Los juegos del hambre", "Suzanne Collins", 2008);
    System.out.println(l3);
    l3.mostrarAutor();
  }
}
