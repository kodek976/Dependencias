

package ExcepcionTextProcess;

public class DatoInvalidoException extends Exception{

    //Dato invalido
    public DatoInvalidoException() {
    }
        
    //Constructor con mensaje
    public DatoInvalidoException(String message) {
        super(message);
    }
    //Constructor con mensaje y causa
    //La causa es la excepción que ocurrió originalmente
    public DatoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }
    

}
