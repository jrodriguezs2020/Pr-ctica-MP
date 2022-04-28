
package practicamp;

import java.io.Serializable;


public class Disciplina extends Habilidad implements Serializable{
    private int coste;
    
    public Disciplina(){
        coste = (int) Math.random() * (3 - 1) + 1;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
}
