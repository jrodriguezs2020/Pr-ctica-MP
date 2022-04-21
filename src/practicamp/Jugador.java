
package practicamp;

import java.io.Serializable;

/**
 *
 * @author Victo
 */
public class Jugador extends Usuario implements Comparable,Serializable{

    private String numRegistro;
    private Personaje personaje;
    private boolean baneado;
    
    public Jugador(String nick, String password) {
        super(nick, password);
    }
    public Jugador( String nombre, String nick, String password) {
        super(nombre, nick, password);
        baneado=false;
        this.personaje = new Personaje(0);
        this.numRegistro=generarNumRegistro();
    }

    public void setBaneado(boolean baneado) {
        this.baneado = baneado;
    }

    public boolean isBaneado() {
        return baneado;
    }
    private String generarNumRegistro () {
        int num = (int) (Math.random() * 9);
        String N = Integer.toString(num);
        int numLetra = (int) Math.random() * (122 - 97) + 97;
        char L = (char)numLetra;
        String numRegistro = L + N + N + L + L;
        return numRegistro;
    }  
    public Personaje getPersonaje() {
        return personaje;
    }
    public int compareTo(Object jug){
     Jugador jugador2 = (Jugador) jug;
     if(this.equals(jug)){
         return 0;
     }
     else{
     int oro1=personaje.getCantidadOro();
     int oro2= jugador2.getPersonaje().getCantidadOro();
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
}
