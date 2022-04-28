/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    ArrayList<Jugador> usuariosList;
    ArrayList<Operador> operadorList;
    ArrayList<Arma> armaList;
    ArrayList<Armadura> armaduraList;
    
   
    public void inicio() throws FileNotFoundException, IOException, ClassNotFoundException{
        ventanas.Usuario_Operador usuOpe =new ventanas.Usuario_Operador(this);
        usuOpe.setVisible(true);
        /*usuariosList = new ArrayList();
       operadorList=new ArrayList();
        armaList = new ArrayList();
        armaduraList = new ArrayList();*/
        /*FileInputStream fileStreamU = new FileInputStream("..\\ListaUsuarios.txt");
        ObjectInputStream objectStreamU = new ObjectInputStream(fileStreamU);
        usuariosList= (ArrayList<Jugador>) objectStreamU.readObject();
        FileInputStream fileStreamO = new FileInputStream("..\\ListaOperadores.txt");
        ObjectInputStream objectStreamO = new ObjectInputStream(fileStreamO);
        operadorList= (ArrayList<Operador>) objectStreamO.readObject();
        FileInputStream fileStreamA = new FileInputStream("..\\ListaArmas.txt");
        ObjectInputStream objectStreamA = new ObjectInputStream(fileStreamA);
        armaList= (ArrayList<Arma>) objectStreamA.readObject();
        FileInputStream fileStreamA2 = new FileInputStream("..\\ListaArmaduras.txt");
        ObjectInputStream objectStreamA2 = new ObjectInputStream(fileStreamA2);
        armaduraList= (ArrayList<Armadura>) objectStreamA2.readObject();*/
    }

    public ArrayList<Arma> getArmaList() {
        return armaList;
    }

    public Sistema() {
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
        }}else{
            for (Operador j : operadorList) {
            if (j.getNick().equals(nick)) {
                return true;
            }
        }}
        return false;
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
            }}
    return null;
    }
    
    public void guardarDatos() throws FileNotFoundException, IOException{
        /*FileOutputStream fileStream = new FileOutputStream("..\\ListaUsuarios.txt");
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
        objectStream.writeObject(usuariosList);
        objectStream.close();
        FileOutputStream fileStreamO = new FileOutputStream("..\\ListaOperadores.txt");
        ObjectOutputStream objectStreamO = new ObjectOutputStream(fileStreamO);
        objectStreamO.writeObject(operadorList);
        objectStreamO.close();
        FileOutputStream fileStreamA = new FileOutputStream("..\\ListaArmas.txt");
        ObjectOutputStream objectStreamA = new ObjectOutputStream(fileStreamA);
        objectStreamA.writeObject(armaList);
        objectStreamA.close();
        FileOutputStream fileStreamA2 = new FileOutputStream("..\\ListaArmaduras.txt");
        ObjectOutputStream objectStreamA2 = new ObjectOutputStream(fileStreamA2);
        objectStreamA2.writeObject(armaduraList);
        objectStreamA2.close();*/
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
        //Jugador jDesafiado = devolucionUsuario(nick);
        
        Desafio desafio = new Desafio (jDesafiado,jDesafiante,oroApostado);
        jDesafiante.getDesafios().add(desafio);
        jDesafiado.getDesafios().add(desafio);
       
    }
    
    public void aceptarDesafio () {
    
    }
    
}

