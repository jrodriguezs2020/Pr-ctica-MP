
package practicamp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Sistema implements Serializable{
    private ArrayList<Jugador> usuariosList;
    private ArrayList<Operador> operadorList;
    private ArrayList<Arma> armaList;
    private ArrayList<Armadura> armaduraList;

    public Sistema (ArrayList <Jugador> usuariosList, ArrayList <Operador> operadoresList){
        this.usuariosList = usuariosList;
        this.operadorList = operadoresList;
    }
    
   
    public void inicio() throws FileNotFoundException, IOException, ClassNotFoundException{
        ventanas.Usuario_Operador usuOpe =new ventanas.Usuario_Operador(this);
        usuOpe.setVisible(true);
       
        
    }

    public ArrayList<Arma> getArmaList() {
        return armaList;
    }

    public Sistema() {
        /*usuariosList = new ArrayList<Jugador>() ;
        operadorList = new ArrayList<Operador>() ;
        armaList = new ArrayList<Arma>();
        armaduraList = new ArrayList<Armadura>();*/
    }

    public ArrayList<Jugador> getUsuariosList() {
        return usuariosList;
    }
    public TreeSet<Jugador> ranking(){
        TreeSet<Jugador> ranking= new TreeSet();
        for(Jugador u:usuariosList){
            ranking.add(u);
        }
        return ranking;
    }
    public boolean personaCorrecta(String nick, String contraseña, int modo){
        boolean result;
        if (modo==1){
            Jugador usuario2 = new Jugador(nick,contraseña);
            if(usuariosList.contains(usuario2)){
                result=true;
            }
            else{
                result=false; 
            }
        }
        else{
            Operador operador2 = new Operador(nick,contraseña);
            if(operadorList.contains(operador2)){
                result=true;
            }
            else{
                result=false; 
            }
        }
        return result;
    }
    
    public Usuario nuevaPersona(String nombre, String nick,String contraseña, int modo) throws FileNotFoundException, IOException{
        if(modo==1){
            Jugador usuario = new Jugador(nombre,nick,contraseña);
            usuariosList.add(usuario);      
            guardarDatos();
            return usuario;
        }
        if(modo==0){
            Operador operador=new Operador(nombre,nick,contraseña);
            operadorList.add(operador);
            guardarDatos();
            return operador;
        }
       
        return null;
    }
    
     
    public boolean comprobarNick (String nick, int modo) {
        if (modo==1){
            for (Usuario i : usuariosList) {
                if (i.getNick().equals(nick)) {
                    return true;
                }
            }
        }
        else{
            for (Operador j : operadorList) {
                if (j.getNick().equals(nick)) {
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<Operador> getOperadorList() {
        return operadorList;
    }
    
    public boolean darBajaJ(Jugador usuario) throws FileNotFoundException, IOException {
        usuariosList.remove(usuario); 
        guardarDatos();
        return true;
    
    }
    public boolean darBajaO(Operador usuario) throws FileNotFoundException, IOException {
        boolean result=false;
        String nick = usuario.getNick();
        for(Operador i : operadorList){
            if(nick.equals(i.getNick()))  {
                operadorList.remove(i);
                guardarDatos();
                return true;
           
            } 
            else{
                result=false;
            }
        }
        return result;
    }
    
    public Jugador devolucionUsuario (String nick){
    for(Jugador i:usuariosList){
        if (i.getNick().equals(nick)) {
            return i;
        }
    }
        return null;
    }
    
    public Operador devolucionOperador(String nick){
        for(Operador i:operadorList){
            if (i.getNick().equals(nick)) {
                return i;
            }
        }
        return null;
    }
    
    public void guardarDatos() throws FileNotFoundException, IOException{
        FileOutputStream fileStream = new FileOutputStream("..\\Informacion.txt");
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
        objectStream.writeObject(this);
        objectStream.close();
    }

    public ArrayList<Armadura> getArmaduraList() {
        return armaduraList;
    }
    public void Banear(String nick){
        Jugador jug = devolucionUsuario(nick);
        jug.setBaneado(true);
    }
    
    public void desBanear(String nick){
        Jugador jug = devolucionUsuario(nick);
        jug.setBaneado(false);
    }
    
    public void desafiar (Jugador jDesafiado, Jugador jDesafiante, int oroApostado) {
        Desafio desafio = new Desafio (jDesafiado,jDesafiante,oroApostado);
        jDesafiante.getDesafios().add(desafio);
        jDesafiado.getDesafios().add(desafio);
    }
    
    public void aceptarDesafio () {
    }
    
}

