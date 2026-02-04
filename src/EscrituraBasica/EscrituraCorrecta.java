

package EscrituraBasica;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscrituraCorrecta {
    public static void main(String[] args) {
        
        try (BufferedWriter contenido = new BufferedWriter(new FileWriter("contenido.txt"))) {
            
           contenido.write("Juan Pérez");
           contenido.newLine();
           contenido.write("María García");
           contenido.newLine();
           contenido.write("Pedro Lopéz");
           contenido.newLine();
           
            
        } catch (Exception e) {
        }
    }
}
