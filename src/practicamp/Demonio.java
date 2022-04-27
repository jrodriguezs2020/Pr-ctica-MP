package practicamp;

import java.util.ArrayList;

public class Demonio extends Esbirro{
    private String pacto;
    private ArrayList <Esbirro> listaEsbirrosD;
    
    public Demonio(){
        this.pacto = "Pacto de Sangre";
        listaEsbirrosD = new ArrayList();
    }

    public ArrayList<Esbirro> getListaEsbirrosD() {
        return listaEsbirrosD;
    }
    
    public String getPacto() {
        return pacto;
    }

    public void setPacto(String pacto) {
        this.pacto = pacto;
    }
    
}
