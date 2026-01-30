

package ExcepcionPersonalizada;

public class ServicioUsuario {
public void registrarUsuario(String nombre,int edad) throws EdadInvalidaException {
    if (edad<0) {
        throw new EdadInvalidaException("La edad no puede ser negativa. Tienes "+edad);
        
    
    }
}
}
