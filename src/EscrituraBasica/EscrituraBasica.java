

package EscrituraBasica;

import java.io.FileWriter;


public class EscrituraBasica {
    public static void main(String[] args) {
        FileWriter fichero = null;
        
        try {
        fichero = new FileWriter("datos.txt");  
        
        fichero.write("Primera línea\n");
        fichero.write("Primera segunda\n");
        fichero.write("Primera tercera\n");
            
            
        } catch (Exception e) {
        }
    }
}
