
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
    
    private int saludEsbirros (Jugador jugador) {
        ArrayList<Esbirro> esbirros = jugador.getPersonaje().getEsbirroList();
        int salud = 0;
        Demonio demonio = new Demonio();
        for (Esbirro s: esbirros){
            if (demonio.getClass() == s.getClass()) {
                demonio = (Demonio) s;
                for (Esbirro d: demonio.getListaEsbirrosD()) {
                    salud = salud + s.getSalud();
                }
            }
            salud = salud + s.getSalud();
        }
        return salud;
    }
    
    private int potencial (Jugador jugador, int modo) {
        Vampiro vampiro = new Vampiro();
        Cazador cazador = new Cazador();
        Personaje personaje = jugador.getPersonaje();
        int potencial = 0;
        int poder = poder = personaje.getPoder();
        ArrayList<Arma> armas = personaje.getArmaList();
        int equipo = 0;
        
        for (Arma s : armas) {
            if (modo == 1) {
                equipo = equipo + s.getModificadorAtaque();
            }
            else {
                equipo = equipo + s.getModificadorDefensa();
            }
        }
        
        if (modo == 1) {
            equipo = equipo + personaje.getArmadura().getModificadorAtaque();
        }
        else {
            equipo = equipo + personaje.getArmadura().getModificadorDefensa();
        }
        
        potencial = poder + equipo;
        
        if (personaje.getClass() == vampiro.getClass()) {
            vampiro = (Vampiro) personaje;
            int disciplina = vampiro.getDisci().getCoste();
            int puntosSangre = vampiro.getPuntosSangre();
            puntosSangre = puntosSangre - disciplina;
            if (puntosSangre >= 0) {
                potencial = potencial + disciplina;
            }
            if (puntosSangre>4) {
                potencial = potencial +2;
            }
        }
        
        else if (personaje.getClass() == cazador.getClass()) {
            cazador = (Cazador) personaje;
            int talento = cazador.getTalento().getEdad();
            int voluntad = cazador.getPuntosVoluntad();
            potencial = potencial + talento + voluntad;
        }
        
        else {
            Licantropo licantropo = new Licantropo();
            licantropo = (Licantropo) personaje;
            int don = licantropo.getDon().getRabiaMin();
            int rabia = licantropo.getRabia();
            potencial = potencial + don + rabia;
        }
        return potencial;
    }
    
    private int ataque (Jugador jugador) {
        int potencial = potencial(jugador,1);
        int cont = 0;
        for (int i = 1; i<=potencial; i++) {
            int exito = (int) Math.random() * (6 - 1) + 1;
            if (exito > 4) {
                cont++;
            }
        }
        return cont;
    }
    
    private int defensa (Jugador jugador) {
        int potencial = potencial(jugador,0);
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
        int saludDesafiado = desafiado.getPersonaje().getSalud();
        int saludDesafiante = desafiante.getPersonaje().getSalud();
        int salud1 = saludEsbirros1 + saludDesafiado;
        int salud2 = saludEsbirros2 + saludDesafiante;
        rondas = 0;
        
        while (salud1 > 0 & salud2 > 0) {
            rondas ++;
            salud1 = salud1 - ataque(desafiante) + defensa(desafiado);
            salud2 = salud2 - ataque(desafiado) + defensa(desafiante);
        }
        
        if (salud1>0) {
            vencedor = desafiado; 
        }
        else if (salud2>0) {
            vencedor = desafiante;
        }
        else {
            vencedor = null;
        }
        
        saludEsbirros1 = saludEsbirros1 - salud1;
        salud(desafiado, saludEsbirros1, saludDesafiado, salud1);
        saludEsbirros2 = saludEsbirros2 - salud2;
        salud(desafiante, saludEsbirros2, saludDesafiante, salud2);
        oro();
    }
    
    private void oro () {
        if (vencedor != null) {
            if (vencedor == desafiado){
                desafiado.getPersonaje().setCantidadOro(desafiado.getPersonaje().getCantidadOro()+oroApostado);
                desafiante.getPersonaje().setCantidadOro(desafiante.getPersonaje().getCantidadOro()-oroApostado);
            }
            else{
                desafiado.getPersonaje().setCantidadOro(desafiado.getPersonaje().getCantidadOro()-oroApostado);
                desafiante.getPersonaje().setCantidadOro(desafiante.getPersonaje().getCantidadOro()+oroApostado);
            }
        }
    }

    private void salud (Jugador jugador, int saludEsbirros, int saludJugador, int saludAux) {
        if (saludEsbirros < 0) {
            jugador.getPersonaje().getEsbirroList().clear();
            saludJugador = saludJugador + saludEsbirros;
            if (saludJugador < 0) {
                saludJugador = 0;
            }
            saludEsbirros = 0;
        }
        else {
            while (saludAux >= 0) {
                int saludEsbirro = desafiante.getPersonaje().getEsbirroList().get(1).getSalud();
                int aux = saludAux;
                saludAux = saludAux - saludEsbirro;
                if (saludAux >= 0) {
                    desafiante.getPersonaje().getEsbirroList().remove(1);
                }
                else {
                    desafiante.getPersonaje().getEsbirroList().get(1).setSalud(saludEsbirro-aux);
                }
            }
        }
    }
    
}
