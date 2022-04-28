/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import java.io.Serializable;

/**
 *
 * @author javii
 */
public abstract class Esbirro implements Serializable{    
    private String nombre;
    int salud;
    
    public Esbirro(){
        this.salud = 5;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getSalud();

    public void setSalud(int salud) {
        this.salud = salud;
    }
    
}
