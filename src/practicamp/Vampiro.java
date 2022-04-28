package practicamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Vampiro extends Personaje{
    
    private int puntosSangre;
    private int edad;
    private Disciplina disci = new Disciplina();
    
    public Vampiro(){
        this.puntosSangre = (int) Math.random() * (10);
        this.edad = Math.toIntExact(Math.round(Math.random()*100+200));
        this.disci = disci;
    }
    
    public void comprobarDisciplina (Disciplina disci){
        puntosSangre -= disci.getCoste();
    }

    public int getPuntosSangre() {
        return puntosSangre;
    }

    public void setPuntosSangre(int puntosSangre) {
        this.puntosSangre = puntosSangre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Disciplina getDisci() {
        return disci;
    }

    public void setDisci(Disciplina disci) {
        this.disci = disci;
    }
    
    public void setModificador(){
        Modificador mod = new Modificador("sangre", 2, 1);
        super.modificadorList.add(mod);
    }    
    
    
}
