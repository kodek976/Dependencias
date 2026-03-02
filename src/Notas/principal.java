
package Notas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class principal {
    public static void main(String[] args) {
        int suspensos=0;
        try (BufferedReader br = new BufferedReader(new FileReader("notas.txt"));
                PrintWriter pw = new PrintWriter(new FileWriter("suspensos.txt"))){
            String linea = null;
            while ((linea = br.readLine())!= null) {
                String[] datos = linea.split(",");
                String nombre = datos [0];
                double nota = Double.parseDouble(datos[1]);
                
                if (nota<5) {
                    System.out.println(nombre+" "+nota);
                    pw.println(nombre.toUpperCase()+nota);
                    suspensos++;
                } 
            }
            System.out.println("Suspensos: "+suspensos);
        } catch (Exception e) {
            System.err.println("Error de ficheros"+e.getMessage());
        }
    }
}
