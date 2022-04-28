
package practicamp;


public class Humano extends Esbirro{

    @Override
    public int getSalud() {
        return salud;
    }

    public enum Lealtad{ALTA, MEDIA, BAJA};
    private Lealtad leal;
    
    public Humano(){
        this.leal = Lealtad.MEDIA;
    }
}
