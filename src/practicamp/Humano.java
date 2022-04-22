/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

/**
 *
 * @author javii
 */
public class Humano extends Esbirro{

    public enum Lealtad{ALTA, MEDIA, BAJA};
    private Lealtad leal;
    
    public Humano(){
        this.leal = Lealtad.MEDIA;
    }
}
