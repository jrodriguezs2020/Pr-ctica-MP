
package practicamp;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable , Comparable{
    private String nombre;
    private String nick;
    private String password;
    private String numRegistro;
    private Personaje personaje;

    public Usuario(String nombre, String nick, String password) {
        this.nombre = nombre;
        this.nick = nick;
        this.password = password;
        this.numRegistro = generarNumRegistro ();
        this.personaje= new Personaje(0);
       
    }
    
    private String generarNumRegistro () {
        int num = (int) (Math.random() * 9);
        String N = Integer.toString(num);
        int numLetra = (int) Math.random() * (122 - 97) + 97;
        char L = (char)numLetra;
        String numRegistro = L + N + N + L + L;
        return numRegistro;
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
@Override
 public int compareTo(Object user){
     Usuario usuario2 = (Usuario) user;
     if(this.equals(user)){
         return 0;
     }
     else{
     
     
     
     int oro1=personaje.getCantidadOro();
     
     
     
     int oro2= usuario2.getPersonaje().getCantidadOro();
     if(oro1<oro2){
         return 1;
     }
     if(oro1>oro2){
         return -1;
     }
     else{
         
         return 1;
     }
     }
     
 }

    public Personaje getPersonaje() {
        return personaje;
    }
}
