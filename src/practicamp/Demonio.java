package practicamp;

import java.util.ArrayList;

public class Demonio extends Esbirro{
    private String pacto;
    private ArrayList <Esbirro> listaEsbirrosD;
    
    public Demonio(){
        this.pacto = "Pacto de Sangre";
        listaEsbirrosD = new ArrayList();
    }

    /**
     *
     * @return
     */
    @Override
    public int getSalud(){
        int salud=this.salud;
        for(Esbirro e:listaEsbirrosD){
            salud=salud+e.getSalud();
        }
        return salud;
    }
    public void addEsbirro(Esbirro e){
        listaEsbirrosD.add(e);
    }
    public void removeEsbirro(Esbirro e){
        listaEsbirrosD.remove(e);
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
