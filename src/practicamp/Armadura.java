
package practicamp;

import java.io.Serializable;

public class Armadura extends Equipo implements Serializable{

    private String nombre; 
    private int modificadorAtaque;
    private int modificadorDefensa;

    public Armadura(String nombre, int modificadorAtaque, int modificadorDefensa) {
        super(nombre, modificadorAtaque, modificadorDefensa);
    }         
    
}
