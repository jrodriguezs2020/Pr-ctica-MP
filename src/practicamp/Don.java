/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

/**
 *
 * @author Laura
 */
public class Don extends Habilidad{
    private int rabiaMin;
    
    public Don(){
        this.rabiaMin = Math.toIntExact(Math.round(Math.random()*2+1));
    }

    public int getRabiaMin() {
        return rabiaMin;
    }

    public void setRabiaMin(int rabiaMin) {
        this.rabiaMin = rabiaMin;
    }
    
    
}
