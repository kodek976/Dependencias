

package GestionScanner;

import java.util.Scanner;

public class GestionScanner {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            int numero = sc.nextInt();
            System.out.println("Has introducido:"+numero);
        } catch (Exception e) {
            System.out.println("Error: Debes introducir un número");
        } finally {
            System.out.println("Este mensaje aparece siempre");
            //Aquí se liberarían recursos 
        }
        System.out.println("El programa continua");
    }
}
