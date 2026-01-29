

package EjemploMultiCatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());//Podría lanzar NullPointerException
            int[]numeros={1,2,3};
            System.out.println(numeros[5]);
            
            Path archivo = Paths.get("no_existe.txt");
            Files.readAllBytes(archivo); //Podría lanzar IOException
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de acceso a datos:"+e.getMessage());
        }catch(IOException e){
            System.out.println("Error de entrada/salida"+e.getMessage());
        }catch(Exception e){
            System.out.println("Error inesperado"+e.getMessage());
        }
            
    }
}
