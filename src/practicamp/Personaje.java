
package practicamp;

import java.io.Serializable;
import java.util.ArrayList;

public class Personaje implements Serializable{
    private String nombre;
    private int cantidadOro;
    private int salud;
    private int poder;
    private ArrayList<Esbirro> esbirroList;
    private ArrayList<Arma> armaList;
    private Armadura armadura;
    private ArrayList<Modificador> modificadorList;
    private Modificador fortaleza;
    private Modificador debilidad;


    public Personaje() {
        this.cantidadOro = 500;
        this.esbirroList = new ArrayList();
        this.salud =5;
        this.poder = Math.toIntExact(Math.round(Math.random()*4+1));
        this.armaList = new ArrayList<Arma>();
        this.armadura = null;
        this.modificadorList = new ArrayList();
        this.fortaleza = null;
        this.debilidad = null;
    }

    public Modificador getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(Modificador fortaleza) {
        this.fortaleza = fortaleza;
    }

    public Modificador getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(Modificador debilidad) {
        this.debilidad = debilidad;
    }

    public ArrayList<Modificador> getModificadorList() {
        return modificadorList;
    }

    public void setModificadorList(ArrayList<Modificador> modificadorList) {
        this.modificadorList = modificadorList;
    } 

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
    
    public ArrayList<Arma> getArmaList(){
        return armaList;
    }
    
    public void setArmaList(ArrayList<Arma> armaList){
        this.armaList = armaList;
    }

    public ArrayList<Esbirro> getEsbirroList(){
        return esbirroList;
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
