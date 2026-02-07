
package Biblioteca;

public class Principal {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        System.out.println(l1);
        Libro l2 = new Libro("Mortadelo y Filemón","Ibañez",1998);
        String Descripcion = l2.tostring();
        l2.mostrarAutor();
        
        //trabajamos con libro de ficción
        LibroDeFiccion l3 = new LibroDeFiccion("Los juegos del hambre", "Suzanne Collins", 2008, "Ficción");
        System.out.println(l3);
        l3.mostrarAutor();
    }
}
