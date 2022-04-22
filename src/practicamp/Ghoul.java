/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

/**
 *
 * @author javii
 */
public class Ghoul extends Esbirro{
    
    private int dependencia;
    
    public Ghoul(){
        this.dependencia = Math.toIntExact(Math.round(Math.random()*4+1));
    }

    public int getDependencia() {
        return dependencia;
    }

    public void setDependencia(int dependencia) {
        this.dependencia = dependencia;
    }
    
    
    
}
