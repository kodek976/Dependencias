
package bombones;

public class Bombon {
    //Atributos
    private String color;
    private Chocolate Chocolate;
    
    //Constructor
    public Bombon() {
    }
    public Bombon(String color) {
        this.color = color;
    }
    //Constructor nuevo
    public Bombon(String color, Chocolate Chocolate) {
        this.color = color;
        this.Chocolate = Chocolate;
    }
    //Constructor que va a encapsular la clase de chocolate
    public Bombon(String color, String sabor, double precio){
        this.color = color;
        this.Chocolate = new Chocolate(sabor, precio); 
    }
    //Getter y Setter
    public String getColor() {
        return color;
    }
    //Getter y Setter nuevo

    public Chocolate getChocolate() {
        return Chocolate;
    }

    public void setChocolate(Chocolate Chocolate) {
        this.Chocolate = Chocolate;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    //Getters y Setters con encapsulacion
        // Getters y setters con encapsulación
    public String getSabor(){
        return Chocolate.getSabor();
    }
    
    public double getPrecio(){
        return Chocolate.getPrecio();
    }
    
    public void setPrecio(double precio){
        this.Chocolate.setPrecio(precio);
    }
    
    
}
