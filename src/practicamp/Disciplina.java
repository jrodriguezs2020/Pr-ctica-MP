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
public class Disciplina extends Habilidad{
    private int coste;
    
    public Disciplina(){
        this.coste = Math.toIntExact(Math.round(Math.random()*2+1));
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
       
}
