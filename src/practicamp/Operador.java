
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
    

   /* @Override
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
        if (!Objects.equals(this.nick, other.getNick())) {
            return false;
        }
        if (!Objects.equals(this.password, other.getPassword())) {
            return false;
        }
        return true;
    }*/

    

     public void editarPersonaje () {
    }
    
    public void anadirArma () {
    }
    
    public void anadirArmadura () {
    }
    
    public void anadirFortaleza () {
    }
    
    public void anadirDebilidad () {
    }
    
    public void anadirEsbirro () {
    }
    
    public void validarDesafio () { //devolverá un boolean
    }
    
    public void gestionarFortaleza () {
    }
    
    public void gestionarDebilidad () {
    }
    
    public void banear () {
    }
    
    public void desbanear () {
    }
}
