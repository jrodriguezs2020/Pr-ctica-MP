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
        public void inicio() throws FileNotFoundException, IOException, ClassNotFoundException{
        ventanas.inicioSesion inicio = new ventanas.inicioSesion(this);
        inicio.setVisible(true);
        usuariosList = new ArrayList();
        FileInputStream fileStream = new FileInputStream("..\\ListaUsuarios.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fileStream);
        usuariosList= (ArrayList<Usuario>) objectStream.readObject();
          
        }
    public boolean usuarioCorrecto(String nick, String contraseña){
        boolean result;
        Usuario usuario2 = new Usuario(nick,contraseña);
        if(usuariosList.contains(usuario2)){
           result=true;
        }
        else{
           result=false; 
        }
        return result;
    }
    public void nuevoUsuario(String nombre, String nick,String contraseña) throws FileNotFoundException, IOException{
        Usuario usuario = new Usuario(nombre,nick,contraseña);
        usuariosList.add(usuario);
        FileOutputStream fileStream = new FileOutputStream("..\\ListaUsuarios.txt");
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
        objectStream.writeObject(usuariosList);
        objectStream.close();
    
    }
    
    public boolean comprobarNick (String nick) {
        for (Usuario i : usuariosList) {
            if (i.getNick().equals(nick)) {
                return true;
            }
        }
        return false;
    }
    
}

