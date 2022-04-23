
package practicamp;

import java.io.Serializable;

public class Armadura extends Equipo implements Serializable{

    private String nombre; 
    private int modificadorAtaque;
    private int modificadorDefensa;

    public Armadura(String nombre, int modificadorAtaque, int modificadorDefensa) {
        super(nombre, modificadorAtaque, modificadorDefensa);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getModificadorAtaque() {
        return modificadorAtaque;
    }

    public void setModificadorAtaque(int modificadorAtaque) {
        this.modificadorAtaque = modificadorAtaque;
    }

    public int getModificadorDefensa() {
        return modificadorDefensa;
    }

    public void setModificadorDefensa(int modificadorDefensa) {
        this.modificadorDefensa = modificadorDefensa;
    }
            
    
    
}
