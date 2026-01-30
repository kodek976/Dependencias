

package Excepciones;
public class Principal {
    public static void main(String[] args) {
        int a =10;
        int b=0;
        try {
         int resultado=a/b;
        System.out.println("Resultado:"+resultado);  
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir entre cero");
            System.err.println("Mensaje técnico:"+e.getMessage());
        }
        System.out.println("El programa continua");
    }
}
