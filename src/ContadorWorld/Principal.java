

package ContadorWorld;

import java.io.BufferedReader;
import java.io.FileReader;


public class Principal {
    public static void main(String[] args) {
        try (BufferedReader Br = new BufferedReader(new FileReader("contador.txt"))){//Permitimos leerlo
            int palabras = 0;
            int parrafos = 0;
            int sinEspacio = 0;
            int ConEspacio = 0;
            
            String linea;
            while ((linea = Br.readLine())!= null) {//Leemos línea por línea
                if (linea.length() !=0) {//Si está vacía sumamos un párrafo
                    parrafos++;
                    
                    ConEspacio += linea.length();
                    
                    String[] palabrasLinea = linea.split(" ");//divide el texto por los espacios y devuelve un array
                    palabras += palabrasLinea.length;
                    
                    for (String s : palabrasLinea) {//recorre el array  
                        sinEspacio+= s.length();
                    }
                }
            }
         System.out.println("Palabras: "+palabras);
        System.out.println("Párrafos: "+parrafos);
        System.out.println("Carácteres sin espacio"+sinEspacio);
        System.out.println("Carácteres con espacio: "+ConEspacio);
        } catch (Exception e) {
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
