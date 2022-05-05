
package practicamp;


public class ConcreteLicantropo extends Personaje{
    
    private int rabia;
    private int dañoSufrido;
    private Don don;
    
    public ConcreteLicantropo(){
        this.rabia = 0;
        don = new Don ();
        this.setModificador();        
    }
    
    public boolean comprobarDon (Don don){
        if (rabia >= don.getRabiaMin()){
            return true;
        } else {
            return false;
        }
    }

    public int getRabia() {
        return rabia;
    }

    public void setRabia(int rabia) {
        this.rabia = rabia;
    }

    public int getDañoSufrido() {
        return dañoSufrido;
    }

    public void setDañoSufrido(int dañoSufrido) {
        this.dañoSufrido = dañoSufrido;
    }

    public Don getDon() {
        return don;
    }

    public void setDon(Don don) {
        this.don = don;
    }
    
    public void setModificador(){
        Modificador mod = new Modificador("luna", 2, 1);
        super.modificadorList.add(mod);
    }
    
}
