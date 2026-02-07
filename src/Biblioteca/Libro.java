
package Biblioteca;

public class Libro {
    //Atributos
        private String título;
        private String autor;
        private Integer year;
    //Getters y setters

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    //Constructor

    public Libro() {
    }

    public Libro(String título, String autor, Integer year) {
        this.título = título;
        this.autor = autor;
        this.year = year;
    }
        
    //Métodos
        public String tostring(){
            return "´{Título:"+título+" ,autor:"+autor+" ,año"+year+'}';
        }
        
        public void mostrarAutor(){
            System.out.println("Autor:"+autor);
        }
    
}
