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

public class Sistema {
    ArrayList<Usuario> usuariosList;
    ArrayList<Operador> operadorList;

    
   
        public void inicio() throws FileNotFoundException, IOException, ClassNotFoundException{
        ventanas.Usuario_Operador usuOpe =new ventanas.Usuario_Operador(this);
        usuOpe.setVisible(true);
        
        //ventanas.inicioSesion inicio = new ventanas.inicioSesion(this);
        //inicio.setVisible(true);
        usuariosList = new ArrayList();
        operadorList=new ArrayList();
        FileInputStream fileStreamU = new FileInputStream("..\\ListaUsuarios.txt");
        ObjectInputStream objectStreamU = new ObjectInputStream(fileStreamU);
        usuariosList= (ArrayList<Usuario>) objectStreamU.readObject();
        FileInputStream fileStreamO = new FileInputStream("..\\ListaOperadores.txt");
        ObjectInputStream objectStreamO = new ObjectInputStream(fileStreamO);
        operadorList= (ArrayList<Operador>) objectStreamO.readObject();
          
        }
    public boolean personaCorrecta(String nick, String contraseña, int modo){
        boolean result;
        if (modo==1){
        Usuario usuario2 = new Usuario(nick,contraseña);
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
    
    public void nuevaPersona(String nombre, String nick,String contraseña, int modo) throws FileNotFoundException, IOException{
        if(modo==1){
        Usuario usuario = new Usuario(nombre,nick,contraseña);
        usuariosList.add(usuario);
        FileOutputStream fileStreamU = new FileOutputStream("..\\ListaUsuarios.txt");
        ObjectOutputStream objectStreamU = new ObjectOutputStream(fileStreamU);
        objectStreamU.writeObject(usuariosList);
        objectStreamU.close();
        }
        if(modo==0){
        Operador operador=new Operador(nombre,nick,contraseña);
        operadorList.add(operador);
        FileOutputStream fileStreamO = new FileOutputStream("..\\ListaOperadores.txt");
        ObjectOutputStream objectStreamO = new ObjectOutputStream(fileStreamO);
        objectStreamO.writeObject(operadorList);
        objectStreamO.close();
        }
       
    
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
                FileOutputStream fileStream = new FileOutputStream("..\\ListaUsuarios.txt");
                ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
                objectStream.writeObject(usuariosList);
                objectStream.close();
                return true;
            } 
   
    }
        
    return false;
    
    }
    
    public Usuario devolucionUsuario (String nick){
    for(Usuario i:usuariosList){
    if (i.getNick().equals(nick)) {
                return i;
            }}
    return null;
    }
    
}

