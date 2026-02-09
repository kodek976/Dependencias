

package EscrituraBasica;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraConPrintWriter {
    public static void main(String[] args) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("informe.txt")){
          
        } catch (Exception e) {
        }
      }
   
}
