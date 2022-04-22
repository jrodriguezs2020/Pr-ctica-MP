
package practicamp;

import java.io.Serializable;
import java.util.ArrayList;

public class Personaje implements Serializable{
    private String nombre;
    private int cantidadOro;
    private int salud;
    private int poder;
    ArrayList<Esbirro> esbirroList;


    public Personaje() {
        this.cantidadOro = 500;
        this.esbirroList = new ArrayList();
    }

    public ArrayList<Esbirro> getEsbirroList(){
        return esbirroList;
    }
    
    public void aniadirEsbirro(Esbirro esbi){
        this.esbirroList.add(esbi);
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
