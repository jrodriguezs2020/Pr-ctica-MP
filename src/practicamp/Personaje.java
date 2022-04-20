
package practicamp;

import java.io.Serializable;

public class Personaje implements Serializable{
    private String nombre;
    private int cantidadOro;
    private int salud;
    private int poder;

    public Personaje(int cantidadOro) {
        this.cantidadOro = cantidadOro;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadOro() {
        return cantidadOro;
    }

    public void setCantidadOro(int cantidadOro) {
        this.cantidadOro = cantidadOro;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
