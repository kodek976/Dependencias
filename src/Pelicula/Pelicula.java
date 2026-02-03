
package Pelicula;

public class Pelicula {
    // Atributos
    private String titulo;
    private int minutos;
    private int minutoActual;
    // la variable pertenece a la clase, no al objeto
    private static int contador; // para contar los objetos
    // se ha convertido en una variable globlal
    
    // getters y setters

    public static int getContador() {
        return contador;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getMinutoActual() {
        return minutoActual;
    }
/*
    public void setMinutoActual(int minutoActual) {
        this.minutoActual = minutoActual;
    }
*/  
    // Constructores

    public Pelicula() {
        contador++;
    }
    
    public Pelicula(String titulo, int minutos) {
        this.titulo = titulo;
        this.minutos = minutos;
        // empezamos en el minuto 0
        minutoActual = 0;
        contador++;
    }
    
    // Métodos propios
    public void avanzarMinuto(){
        // incrementar el minuto
        minutoActual++;
    }
    // avanzar sobre el reproductor unos minutos
    // lo cambiamos a private
    // he decidido que no se acceda desde el objeto
    private void avanzarMinuto(int minutos){
        minutoActual+= minutos; 
    }
    
    // avanzar capítulo, para mí son 20 minutos
    public void avanzarCapitulo(){
        avanzarMinuto(20); // Solo se accede desde la clase
    }

}

