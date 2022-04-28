/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import java.io.Serializable;

/**
 *
 * @author Laura
 */
public class Don extends Habilidad implements Serializable{
    private int rabiaMin;
    
    public Don(){
        rabiaMin = Math.toIntExact(Math.round(Math.random()*2+1));
        valorAtaque = Math.toIntExact(Math.round(Math.random()*2+1));
        valorDefensa = Math.toIntExact(Math.round(Math.random()*2+1));
    }

    public int getRabiaMin() {
        return rabiaMin;
    }

    public void setRabiaMin(int rabiaMin) {
        this.rabiaMin = rabiaMin;
    }

    public int getValorAtaque() {
        return valorAtaque;
    }

    public void setValorAtaque(int valorAtaque) {
        this.valorAtaque = valorAtaque;
    }

    public int getValorDefensa() {
        return valorDefensa;
    }

    public void setValorDefensa(int valorDefensa) {
        this.valorDefensa = valorDefensa;
    }
    
    
}
