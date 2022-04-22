
package practicamp;

import java.io.Serializable;

public class Armadura extends Equipo implements Serializable{

    public Armadura(String nombre, int modificadorAtaque, int modificadorDefensa) {
        super(nombre, modificadorAtaque, modificadorDefensa);
    }
    
}
