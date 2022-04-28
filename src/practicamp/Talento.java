
package practicamp;

import java.io.Serializable;


public class Talento extends Habilidad implements Serializable{
    private int edad;
    
    public Talento(){
        this.edad = Math.toIntExact(Math.round(Math.random()*50+20));
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
