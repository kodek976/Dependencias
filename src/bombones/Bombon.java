
package bombones;

public class Bombon {
    //Atributos
    private String color;
    private Chocolate chocolate;//Utilizamos esto porque es la agregación es lo mismo que decir que un bombon tiene chocolate. 
                                //Si utilizaramos herencia diriamos que un bombon es lo mismo que un chocolate 
    
    //Constructor
    public Bombon() {
    }
    public Bombon(String color) {
        this.color = color;
    }
    //Constructor nuevo
    public Bombon(String color, Chocolate Chocolate) {
        this.color = color;
        this.chocolate = Chocolate;
    }
    //Constructor que va a encapsular la clase de chocolate(Para no tener que utilizar la clase chocolate)
    public Bombon(String color, String sabor, double precio){
        this.color = color;
        this.chocolate = new Chocolate(sabor, precio); 
    }
    //Getter y Setter
    public String getColor() {
        return color;
    }
    //Getter y Setter nuevo

    public Chocolate getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolate Chocolate) {
        this.chocolate = Chocolate;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
 
    // Getters y setters con encapsulación
    public String getSabor(){
        return chocolate.getSabor();
    }
    
    public double getPrecio(){
        return chocolate.getPrecio();
    }
    
    public void setPrecio(double precio){
        this.chocolate.setPrecio(precio);
    }
    
    
}
