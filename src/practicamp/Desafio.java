
package practicamp;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Desafio implements Serializable {
    private boolean aceptado; //si el usuario acepta el desafio
    private boolean validado; //si el operador aprueba el desafio
    private Jugador desafiado;
    private Jugador desafiante;
    private int rondas;
    private int oroGanado;
    private String fecha;
    private int oroApostado;
    private Jugador vencedor;

    public int getOroApostado() {
        return oroApostado;
    }
    
    public Desafio(Jugador desafiado, Jugador desafiante, int oroApostado) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        rondas = 0;
        oroGanado = 0;
        aceptado = false;
        validado = false;
        this.oroApostado = oroApostado;
    }

    public Jugador getVencedor() {
        return vencedor;
    }

    public void setVencedor(Jugador vencedor) {
        this.vencedor = vencedor;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }

    public Jugador getDesafiado() {
        return desafiado;
    }


    public Jugador getDesafiante() {
        return desafiante;
    }


    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public int getOroGanado() {
        return oroGanado;
    }

    public void setOroGanado(int oroGanado) {
        this.oroGanado = oroGanado;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    public int saludEsbirros (Jugador jugador) {
        ArrayList<Esbirro> esbirros = jugador.getPersonaje().getEsbirroList();
        int salud = 0;
        for (Esbirro s: esbirros){
            salud = salud + s.getSalud();
        }
        return salud;
    }
    
    public int potencialAtaque (Jugador jugador) {
        Vampiro vampiro = new Vampiro();
        Cazador cazador = new Cazador();
        Personaje personaje = jugador.getPersonaje();
        int potencial = 0;
        int poder = poder = personaje.getPoder();
        ArrayList<Arma> armas = personaje.getArmaList();
        int equipo = 0;
        for (Arma s : armas) {
            equipo = equipo + s.getModificadorAtaque();
        }
        equipo = equipo + personaje.getArmadura().getModificadorAtaque();
        
        if (personaje.getClass() == vampiro.getClass()) {
            vampiro = (Vampiro) personaje;
            //int disciplina = vampiro.getDisci().getCoste();
            //Ver lo de la disciplina
            potencial = poder + equipo;
            int puntosSangre = vampiro.getPuntosSangre();
            if (puntosSangre>4) {
                potencial = potencial +2;
            }
        }
        
        else if (personaje.getClass() == cazador.getClass()) {
            cazador = (Cazador) personaje;
            int talento = cazador.getTalento().getEdad();
            int voluntad = cazador.getPuntosVoluntad();
            potencial = poder + equipo + talento + voluntad;
        }
        
        else {
            Licantropo licantropo = new Licantropo();
            licantropo = (Licantropo) personaje;
            int don = licantropo.getDon().getRabiaMin();
            int rabia = licantropo.getRabia();
            potencial = poder + equipo + don + rabia;
        }
        return potencial;
    }
    
    public int potencialDefensa () {
        return 0;
    }
    
    public int ataque (Jugador jugador) {
        int potencial = potencialAtaque(jugador);
        int cont = 0;
        for (int i = 1; i<=potencial; i++) {
            int exito = (int) Math.random() * (6 - 1) + 1;
            if (exito > 4) {
                cont++;
            }
        }
        return 0;
    }
    
    public int defensa () {
        int potencial = potencialDefensa();
        int cont = 0;
        for (int i = 1; i<=potencial; i++) {
            int exito = (int) Math.random() * (6 - 1) + 1;
            if (exito > 4) {
                cont++;
            }
        }
        return cont;
    }
    
    public void combate () {
        int saludEsbirros1 = saludEsbirros(desafiado);
        int saludEsbirros2 = saludEsbirros(desafiante);
    }
}
