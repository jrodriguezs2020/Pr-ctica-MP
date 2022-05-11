
package practicamp;


public class Humano extends Esbirro{
    
    private Lealtad leal;

    public enum Lealtad{ALTA, MEDIA, BAJA};
    
    public Humano(){
        this.leal = Lealtad.MEDIA;
    }
    
    @Override
    public int getSalud() {
        return salud;
    }
}
