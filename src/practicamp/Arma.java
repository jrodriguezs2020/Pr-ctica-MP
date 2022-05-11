package practicamp;

import java.io.Serializable;

public class Arma extends Equipo implements Serializable {

    private boolean unaMano;
    private boolean dosManos;

    public Arma(boolean unaMano, boolean dosManos, String nombre, int modificadorAtaque, int modificadorDefensa) {
        super(nombre, modificadorAtaque, modificadorDefensa);
        this.unaMano = unaMano;
        this.dosManos = dosManos;
    }

    public boolean isUnaMano() {
        return unaMano;
    }

    public void setUnaMano(boolean unaMano) {
        this.unaMano = unaMano;
    }

    public boolean isDosManos() {
        return dosManos;
    }

    public void setDosManos(boolean dosManos) {
        this.dosManos = dosManos;
    }
}
