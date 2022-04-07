package practicamp;

public class Arma extends Equipo {

    private boolean unaMano;
    private boolean dosManos;

    public Arma(boolean unaMano, boolean dosManos) {
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
