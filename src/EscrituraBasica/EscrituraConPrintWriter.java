

package EscrituraBasica;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraConPrintWriter {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("informe.txt"))) {
            pw.println("Primera línea");
            pw.println("Segunda línea");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
