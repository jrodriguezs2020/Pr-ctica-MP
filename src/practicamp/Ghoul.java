
package practicamp;


public class Ghoul extends Esbirro{
    
    private int dependencia;
    
    public Ghoul(){
        this.dependencia = Math.toIntExact(Math.round(Math.random()*4+1));
    }

    public int getDependencia() {
        return dependencia;
    }

    public void setDependencia(int dependencia) {
        this.dependencia = dependencia;
    }

    @Override
    public int getSalud() {
        return salud;
    }
    
    
    
}
