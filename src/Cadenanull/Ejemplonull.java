

package Cadenanull;

public class Ejemplonull {
    public static void main(String[] args) {
        try {
            String s =null;
            System.out.println(s.length());//Podría lanzar null pointer
        } catch (NullPointerException e) {
            System.out.println("Error: objeto null");
        }catch(RuntimeException e){
            System.out.println("Error en tiempo de ejecución");
        }catch(Exception e){
            System.out.println("Error general");
        }
    }
}
