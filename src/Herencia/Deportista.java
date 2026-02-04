
package Herencia;

public class Deportista extends Persona{
    private String deporte;
    
    //Constructores
    public Deportista() {
    }

    public Deportista(String deporte) {
        this.deporte = deporte;
    }
   //Solo se utiliza en los constructores y es para hacer referencia a los constructores de la superclase. Cada uno construye con sus atributos
    public Deportista(String deporte, String nombre) {
        super(nombre);//aquí
        this.deporte = deporte;
    }
      
    
    //Getters y Setters

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override//Hacemos un override porque sobre escribe el valor del método para darle uno personalizado
    public void andar() {
        System.out.println(getNombre()+" está andando a 8 Km/h");
    }

    @Override
    public String toString() {
       return "Deportista{ nombre="+super.getNombre()+", deporte="+deporte+'}';
    }
    
    
}
