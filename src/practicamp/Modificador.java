/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicamp;

import java.io.Serializable;

/**
 *
 * @author Laura
 */
public class Modificador implements Serializable{
    private String nombre;
    private int tipo;
    private int valor;
     
     public Modificador(String nombre, int valor, int tipo){
        this.tipo = tipo;
        this.nombre = nombre;
        this.valor = valor;
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
     
}
