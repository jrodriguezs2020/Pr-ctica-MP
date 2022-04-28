
package practicamp;

import java.io.Serializable;


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
