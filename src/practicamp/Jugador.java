
package practicamp;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


public class Jugador extends Usuario implements Comparable,Serializable,Observer{
    private ArrayList <Desafio> desafios;
    private ArrayList <Desafio> desafiosJ;
    private String numRegistro;
    private Personaje personaje;
    private boolean baneado = false;
    private boolean norma = false;
    private ArrayList<String> notificaciones;
    
    public boolean isNorma() {
        return norma;
    }

    public void setNorma(boolean norma) {
        this.norma = norma;
    }

    public ArrayList<String> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(ArrayList<String> notificaciones) {
        this.notificaciones = notificaciones;
    }
    
    public Jugador(String nick, String password) {
        super(nick, password);
    }
    
    public Jugador( String nombre, String nick, String password) {
        super(nombre, nick, password);
        this.personaje = null;
        generarNumRegistro();
        desafios = new ArrayList();
        desafiosJ = new ArrayList();
        notificaciones= new ArrayList();
    }

    public ArrayList<Desafio> getDesafiosJ() {
        return desafiosJ;
    }

    public ArrayList<Desafio> getDesafios() {
        return desafios;
    }

    public void setBaneado(boolean baneado) {
        this.baneado = baneado;
    }

    public boolean isBaneado() {
        return baneado;
    }
    private void generarNumRegistro () {
        int num = (int) (Math.random() * 9);
        String N = Integer.toString(num);
        int numLetra = (int) (Math.random() * (122 - 97) + 97);
        char L = (char)numLetra;
        numRegistro = L + N + N + L + L;
        
    }  
    public Personaje getPersonaje() {
        return personaje;
    }
    
    public void setPersonaje(Personaje personaje){
        this.personaje = personaje;
    }
    
    @Override
    public int compareTo(Object jug){
        Jugador jugador2 = (Jugador) jug;
        if(this.equals(jug)){
            return 0;
        }
        else{
            if(personaje==null){
                return 1;
            }
            if(jugador2.getPersonaje()==null){
                return -1;
            }
            int oro1=personaje.getCantidadOro();
            int oro2= jugador2.getPersonaje().getCantidadOro();
            if(oro1<oro2){
                return 1;
            }
            if(oro1>oro2){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
    
    public boolean desafioPendiente(){
        boolean result=false;
        int i=0;
        while(!result & i<desafios.size()){
            Desafio des = desafios.get(i);
            if(des.getDesafiado()==this){
                if(des.isValidado()){
                    result = true;
                    return true;
                }
            }
            i++;
        }
        return result;
    }

    public void update(Desafio desafio) {
        String numrondas= Integer.toString(desafio.getRondas());
        String ganador;
        if(desafio.getVencedor()!=null){
           ganador="Ganador: "+desafio.getVencedor().getNick();
        }
        else{
            ganador="Empate";
        }
        String nick1= desafio.getDesafiado().getNick();
        String nick2 = desafio.getDesafiante().getNick();
        String oro = Integer.toString(desafio.getOroGanado());
        String desafioTexto = nick1+ " vs "+ nick2+" "+ganador+ ". Rondas jugadas: "+numrondas+" Oro: "+oro;
        notificaciones.add(desafioTexto);
    }
    
    public void eliminarNotificacion () {
        notificaciones.clear();
    }

    public boolean comprobarNorma() {
       for(Desafio d:desafiosJ){
           if(d.getVencedor()!=null & d.getVencedor()!=this){
                String fechaAct = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                Scanner scAc = new Scanner(fechaAct);
                String auxAc=scAc.findInLine("........");
                String SdiaAc = scAc.next();
                String fecha = d.getFecha();
                Scanner sc = new Scanner(fecha);
                String aux=sc.findInLine("........");
                String Sdia = sc.next();
                int diaAc= Integer.parseInt(SdiaAc);
                int dia = Integer.parseInt(Sdia);
                if(diaAc-dia<1){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return true;
    } 
}
