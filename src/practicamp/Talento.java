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
public class Talento extends Habilidad{
    private int edad;
    
    public Talento(){
        this.edad = Math.toIntExact(Math.round(Math.random()*50+20));
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
