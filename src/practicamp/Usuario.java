
package practicamp;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {
    private String nombre;
    private String nick;
    private String password;

    public Usuario(String nombre, String nick, String password) {
        this.nombre = nombre;
        this.nick = nick;
        this.password = password;
        
        
       
    }
    
    
    public Usuario(String nick,String password){
       this.nick = nick;
        this.password = password;  
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nick);
        hash = 29 * hash + Objects.hashCode(this.password);
        return hash;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nick, other.nick)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    
    
     
 

}
