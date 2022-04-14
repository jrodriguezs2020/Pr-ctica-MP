
package practicamp;

import java.io.Serializable;
import java.util.Objects;

public class Operador  implements Serializable{
    private String nombre;
    private String nick;
    private String password;
    
    public Operador(String nombre, String nick, String password){
    this.nombre=nombre;
    this.password=password;
    this.nick=nick;}
    
    public Operador(String nick,String password){
    this.nick=nick;
    this.password=password;}

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Operador other = (Operador) obj;
        if (!Objects.equals(this.nick, other.nick)) {
            return false;
        }
        return true;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
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
