

package EscrituraBasica;

import java.io.BufferedReader;
import java.io.FileReader;

public class EscrituraFichero {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"))){
            String linea;
            int contador=1;
            
            //lee línea a línea hasta el final
            while ((linea=br.readLine())!=null){
                System.out.println(contador+"."+linea);
                contador++;
            }
        } catch (Exception e) {
        }
    }
}
