
package practicamp;

import java.io.Serializable;

public abstract class Habilidad implements Serializable{
     private String nombre;
     private int valorAtaque;
     private int valorDefensa;
     
     public Habilidad(){
         this.nombre = "";
         valorAtaque = Math.toIntExact(Math.round(Math.random()*2+1));
         valorDefensa = Math.toIntExact(Math.round(Math.random()*2+1));
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
