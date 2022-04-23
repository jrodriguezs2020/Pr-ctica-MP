
package practicamp;

import java.io.Serializable;
import java.text.SimpleDateFormat;
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
}
