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
public class Cazador extends Personaje{
    
    private int puntosVoluntad;
    private int salud;
    private Talento talento;
    
    public Cazador(){
        this.puntosVoluntad = 3;
        this.talento = new Talento();
        
    }

    public Talento getTalento() {
        return talento;
    }

    public int getPuntosVoluntad() {
        return puntosVoluntad;
    }

    public void setPuntosVoluntad(int puntosVoluntad) {
        this.puntosVoluntad = puntosVoluntad;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    
}
