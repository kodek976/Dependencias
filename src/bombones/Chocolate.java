
package bombones;

public class Chocolate {
    private String sabor;
    private Double precio;
    
    //Constructor

    public Chocolate() {
    }

    public Chocolate(String sabor, Double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }
    //Getter y Setter

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    
        
}
