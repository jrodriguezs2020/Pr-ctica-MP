
package practicamp;

import java.io.Serializable;

public class Don extends Habilidad implements Serializable{
    private int rabiaMin;
    
    public Don(){
        rabiaMin = Math.toIntExact(Math.round(Math.random()*2+1));
    }

    public int getRabiaMin() {
        return rabiaMin;
    }

    public void setRabiaMin(int rabiaMin) {
        this.rabiaMin = rabiaMin;
    }
    
    
}
