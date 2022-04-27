
package practicamp;

import java.io.Serializable;
import java.util.Objects;

public class Operador extends Usuario implements Serializable{
    private String nombre;
    private String nick;
    private String password;

    public Operador(String nombre, String nick, String password) {
        super(nombre, nick, password);
    }

    public Operador(String nick, String password) {
        super(nick, password);
    }
   @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nick);
        hash = 29 * hash + Objects.hashCode(this.password);
        return hash;
    }
    
}
   

    