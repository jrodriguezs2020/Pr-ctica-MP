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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Sistema {
    TreeSet<Jugador> usuariosList;
    ArrayList<Operador> operadorList;

    
   
        public void inicio() throws FileNotFoundException, IOException, ClassNotFoundException{
        ventanas.Usuario_Operador usuOpe =new ventanas.Usuario_Operador(this);
        usuOpe.setVisible(true);
        usuariosList = new TreeSet();
        operadorList=new ArrayList();
        FileInputStream fileStreamU = new FileInputStream("..\\ListaUsuarios.txt");
        ObjectInputStream objectStreamU = new ObjectInputStream(fileStreamU);
        usuariosList= (TreeSet<Jugador>) objectStreamU.readObject();
        FileInputStream fileStreamO = new FileInputStream("..\\ListaOperadores.txt");
        ObjectInputStream objectStreamO = new ObjectInputStream(fileStreamO);
        operadorList= (ArrayList<Operador>) objectStreamO.readObject();
         
        }

    public Sistema() {
    }

    public TreeSet<Jugador> getUsuariosList() {
        return usuariosList;
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
        }}
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
        FileOutputStream fileStreamO = new FileOutputStream("..\\ListaOperadores.txt");
        ObjectOutputStream objectStreamO = new ObjectOutputStream(fileStreamO);
        objectStreamO.writeObject(operadorList);
        objectStreamO.close();
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
    
    public boolean darBaja(Usuario usuario) throws FileNotFoundException, IOException {
    
    for (Usuario i : usuariosList) {
            if (i.getNick().equals(usuario.getNick())) {
                usuariosList.remove(i);
                guardarDatos();
                return true;
            } 
   
    }
        
    return false;
    
    }
    
    public Jugador devolucionUsuario (String nick){
    for(Jugador i:usuariosList){
    if (i.getNick().equals(nick)) {
                return i;
            }}
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
        FileOutputStream fileStream = new FileOutputStream("..\\ListaUsuarios.txt");
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
        objectStream.writeObject(usuariosList);
        objectStream.close();
    }
    public void Banear(String nick){
        Jugador jug = devolucionUsuario(nick);
        if(usuariosList.remove(jug)){
            jug.setBaneado(true);
        }
        usuariosList.add(jug);
    }
}

