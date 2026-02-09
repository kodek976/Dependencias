

package ContadorWorld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("CONTADOR DEL WORLD");
        try(BufferedReader contenido = new BufferedReader( new FileReader("Documento.txt"));){
        //Contar palabras, letras, caracteres con espacio y sin espacio, parrafos
        String linea = null;
        int acumuladorCon=0;
        int contaParrafos = 0;//Contar párrafos
        int acumuladorPal=0;
        int acumuladorSin=0;
        
        while ((linea=contenido.readLine())!=null) {
            contaParrafos++;
            
        //Guardamos y acumulamos los caráteres por cada párrafo
        int caracterescon= linea.length();
        acumuladorCon+=caracterescon;
        //Guardamos y acumulamos las palabras, tamaño del array
        String[] parrafo = linea.split(" ");
        int contadorPal=parrafo.length;
        acumuladorPal += contadorPal;
        //Ahora contamos las palabras sin espacio desde el parrafo[]
        int acumuladorLetras=0;
            for (String s : parrafo) {
                acumuladorLetras += s.length();
            }
            acumuladorSin+=acumuladorLetras;
        }
           System.out.println("Los párrafos son: "+contaParrafos);
            System.out.println("Los Carácteres con espacios son "+acumuladorCon);
            System.out.println("Los carácteres sin espacios son "+acumuladorSin);
            
        
        //Contar líneas si te digo el tamaño
        } catch (IOException e) {
             System.err.println("Error en la lectura "+e.getMessage());   
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
