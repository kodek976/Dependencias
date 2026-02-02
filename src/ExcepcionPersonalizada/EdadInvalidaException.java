

package ExcepcionPersonalizada;

public class EdadInvalidaException extends Exception {

    //Constructor sin parámetros
    public EdadInvalidaException() {
        super("La edad introducida no es válida");
    }
    
    //Constructor con mensaje personalizado
    public EdadInvalidaException(String message) {
        super(message);
    }
    
    //Constructor con mensaje y causa(opcional)

    public EdadInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }
    


}
