
package Biblioteca;

public class LibroDeFiccion extends Libro{
    private String genero;
    
    //Constructor

    public LibroDeFiccion() {
    }

    
    public LibroDeFiccion(String genero, String título, String autor, Integer year) {
        super(título, autor, year);
        this.genero = genero;
    }
    //getter y setter

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
     
    
      @Override
    public String toString() {
        return "LibroFiccion{" + super.toString() + " - Genero=" + genero + '}';
    }
    
  
}
