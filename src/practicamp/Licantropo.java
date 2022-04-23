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
public class Licantropo extends Personaje{
    
    private int rabia;
    private int dañoSufrido;
    private int salud;
    private Don don;
    
    public Licantropo(){
        
    }
    
    public boolean comprobarDon (Don don){
        if (rabia >= don.getRabiaMin()){
            return true;
        } else {
            return false;
        }
    }

    public int getRabia() {
        return rabia;
    }

    public void setRabia(int rabia) {
        this.rabia = rabia;
    }

    public int getDañoSufrido() {
        return dañoSufrido;
    }

    public void setDañoSufrido(int dañoSufrido) {
        this.dañoSufrido = dañoSufrido;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Don getDon() {
        return don;
    }

    public void setDon(Don don) {
        this.don = don;
    }
    
}
