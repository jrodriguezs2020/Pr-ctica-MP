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
public class Talento extends Habilidad implements Serializable{
    private int edad;
    
    public Talento(){
        this.edad = Math.toIntExact(Math.round(Math.random()*50+20));
        valorAtaque = Math.toIntExact(Math.round(Math.random()*2+1));
        valorDefensa = Math.toIntExact(Math.round(Math.random()*2+1));        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
