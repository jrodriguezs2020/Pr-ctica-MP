
package practicamp;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Desafio implements Serializable,Subject {
    private boolean terminado;

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
    private boolean validado; //si el operador aprueba el desafio
    private Jugador desafiado;
    private Jugador desafiante;
    private int rondas;
    private int oroGanado;
    private String fecha;
    private int oroApostado;
    private Jugador vencedor;
    private int OroGanado;

    public int getOroApostado() {
        return oroApostado;
    }
    
    public Desafio(Jugador desafiado, Jugador desafiante, int oroApostado) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        rondas = 0;
        oroGanado = 0;
        //aceptado = false;
        validado = false;
        this.oroApostado = oroApostado;
    }

    public Jugador getVencedor() {
        return vencedor;
    }

    public void setVencedor(Jugador vencedor) {
        this.vencedor = vencedor;
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
        //Sumar y restar valores de fortaleza y debilidad;
        return potencial;
    }
    
    private int ataque (Jugador jugador) {
        int potencial = potencial(jugador,1);
        int cont = 0;
        for (int i = 1; i<=potencial; i++) {
            int exito = (int) (Math.random() * (6 - 1) + 1);
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
            int exito = (int) (Math.random() * (6 - 1) + 1);
            if (exito > 4) {
                cont++;
            }
        }
        return cont;
    }
    
    private int gestionCombate (Jugador jugador1, Jugador jugador2){
        int result;
        int daño;
        daño = ataque(jugador1) - defensa(jugador2);
        if (daño<0) {
            result = 0;
        }
        else {
            result = daño;
        }
        return result;
    }
    
    public void combate () {
        int saludEsbirros1 = saludEsbirros(desafiado);
        int saludEsbirros2 = saludEsbirros(desafiante);
        int saludDesafiado = desafiado.getPersonaje().getSalud();
        int saludDesafiante = desafiante.getPersonaje().getSalud();
        rondas = 0;
        
        /*Siempre se hacia salud - ataque(desafiante) + defensa(desafiado) esto no está bien porque no siempre ataca el mismo jugador
          al igual pasaba con la defensa, igualmente si ahora ataque - defensa da negativo devuelve 0 y así la salud no aumenta
        */
        
        while(saludDesafiado>0 & saludDesafiante>0){
            rondas++;
            if(saludEsbirros1>0){
                saludEsbirros1= saludEsbirros1 - gestionCombate(desafiante,desafiado);
            }
            else{
                saludDesafiado=saludDesafiado - gestionCombate(desafiante,desafiado);
            }
            if(saludEsbirros2>0){
                saludEsbirros2= saludEsbirros2- gestionCombate(desafiado,desafiante);
            }
            else{
                saludDesafiante=saludDesafiante - gestionCombate(desafiante,desafiado); 
            }
        }
        if (saludDesafiado>0) {
            vencedor = desafiado; 
            if(oroApostado<=desafiado.getPersonaje().getCantidadOro()){
                oroGanado=oroApostado;
            }
            else{
                oroGanado=desafiado.getPersonaje().getCantidadOro();
            }
        }
        else if (saludDesafiante>0) {
            vencedor = desafiante;
            oroGanado=oroApostado;
        }
        else {
            vencedor = null;
            oroGanado=0;
        }
        salud(desafiado, saludEsbirros1);
        salud(desafiante, saludEsbirros2);
        desafiado.getPersonaje().setSalud(saludDesafiado);
        desafiante.getPersonaje().setSalud(saludDesafiante);
        oro();
        notificar();
    }
    
    private void oro () {
        if (vencedor != null) {
            if (vencedor == desafiado){
                desafiado.getPersonaje().setCantidadOro(desafiado.getPersonaje().getCantidadOro()+oroGanado);
                desafiante.getPersonaje().setCantidadOro(desafiante.getPersonaje().getCantidadOro()-oroGanado);
            }
            else{
                desafiado.getPersonaje().setCantidadOro(desafiado.getPersonaje().getCantidadOro()-oroGanado);
                desafiante.getPersonaje().setCantidadOro(desafiante.getPersonaje().getCantidadOro()+oroGanado);
            }
        }
    }

    private void salud (Jugador jugador, int saludEsbirros) {
        if (saludEsbirros <= 0) {
            jugador.getPersonaje().getEsbirroList().clear();
        }
        else {
            while (saludEsbirros > 0) {
                int saludEsbirro = desafiante.getPersonaje().getEsbirroList().get(0).getSalud();
                int aux= saludEsbirros;
                saludEsbirros= saludEsbirros - saludEsbirro;
                if (saludEsbirros >= 0) {
                    desafiante.getPersonaje().getEsbirroList().remove(0);
                }
                else {
                    desafiante.getPersonaje().getEsbirroList().get(0).setSalud(saludEsbirro-aux);
                }
            }
        }
        
    }
public void rechazar(){
    desafiado.getPersonaje().setCantidadOro(desafiado.getPersonaje().getCantidadOro()-oroApostado/100);
    desafiante.getPersonaje().setCantidadOro(desafiante.getPersonaje().getCantidadOro()+oroApostado/100);
}

    

    @Override
    public void notificar() {
        String numrondas= Integer.toString(rondas);
        String ganador;
        if(vencedor!=null){
           ganador="Ganador: "+vencedor.getNick();
        }
        else{
            ganador="Empate";
        }
        String nick1= desafiado.getNick();
        String nick2 = desafiante.getNick();
        String oro = Integer.toString(oroGanado);
        String desafio= nick1+ " vs "+ nick2+" "+ganador+ ". Rondas jugadas: "+numrondas+"Oro: "+oro;
        desafiado.getNotificaciones().add(desafio);
        desafiante.getNotificaciones().add(desafio);
    }
}
