/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Victo
 */
public class SistemaTest {
    private  Sistema sistema;
    public SistemaTest() {
         sistema = new Sistema(); 
    }
        
   
    @Before
    public  void setUp(){
        ArrayList <Jugador> usuariosList = new ArrayList();
        ArrayList <Operador> operadoresList = new ArrayList();
        Jugador j1 = new Jugador("Jugador1","nick1","contraseña1");
        Jugador j2 = new Jugador("Jugador1","Nick1","contraseña1");
        Jugador j3 = new Jugador("Jugador2","nick2","contraseña2");
        Jugador j4 = new Jugador("Jugador4","nick2.","contraseña1."); 
        Operador op1 = new Operador("Operador1","nick1","contraseña1");
        Operador op2 = new Operador("Operador1","Nick1","contraseña1");
        Operador op3 = new Operador("Operador2","nick1","contraseña2");
        Operador op4 = new Operador("Operador4","nick2.","contraseña1.");
        operadoresList.add(op1);
        operadoresList.add(op2);
        operadoresList.add(op3);
        operadoresList.add(op4);
        usuariosList.add(j1);
        usuariosList.add(j2);
        usuariosList.add(j3);
        usuariosList.add(j4);
        sistema.setOperadorList(operadoresList);
        sistema.setUsuariosList(usuariosList);
    }
    /**
     * Test of inicio method, of class Sistema.
     */
    @Test
    public void testInicio() throws Exception {
    }

    /**
     * Test of getArmaList method, of class Sistema.
     */
    @Test
    public void testGetArmaList() {
    }

    /**
     * Test of getUsuariosList method, of class Sistema.
     */
    @Test
    public void testGetUsuariosList() {
    }

    /**
     * Test of ranking method, of class Sistema.
     */
    @Test
    public void testRanking() {
    }

    /**
     * Test of personaCorrecta method, of class Sistema.
     */
    @Test
    public void testPersonaCorrecta() {
        String nick1 = "nicky";
        String contraseña1 = "contra";
        String nick2 = "nick1";
        String contraseña2 = "contraseña1";
        String nick3 = "nick1";
        String contraseña3 = "contra";
        String nick4 = "j$;3";
        String contraseña4=".2?";
        String nick5="nick2.";
        String contraseña5 = "contraseña1.";
        int modoO = 0;
        int modoJ=1;
        
        boolean expResultF = false;
        boolean expResultV = true;
        boolean result1 = sistema.personaCorrecta(nick1, contraseña1, modoJ);
        boolean result2 = sistema.personaCorrecta(nick2, contraseña2, modoJ);
        boolean result3 = sistema.personaCorrecta(nick3, contraseña3, modoJ);
        boolean result4 = sistema.personaCorrecta(nick4, contraseña4, modoJ);
        boolean result9 = sistema.personaCorrecta(nick5, contraseña5, modoJ);
        assertEquals(expResultF, result1);
        assertEquals(expResultV, result2);
        assertEquals(expResultF, result3);
        assertEquals(expResultF, result4);
        assertEquals(expResultV, result9);
        boolean result5 = sistema.personaCorrecta(nick1, contraseña1, modoO);
        boolean result6 = sistema.personaCorrecta(nick2, contraseña2, modoO);
        boolean result7 = sistema.personaCorrecta(nick3, contraseña3, modoO);
        boolean result8 = sistema.personaCorrecta(nick4, contraseña4, modoO);
        boolean result10 = sistema.personaCorrecta(nick5, contraseña5, modoO);
        assertEquals(expResultF, result5);
        assertEquals(expResultV, result6);
        assertEquals(expResultF, result7);
        assertEquals(expResultF, result8);
        assertEquals(expResultV, result10);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    

    }

    /**
     * Test of nuevaPersona method, of class Sistema.
     */
    @Test
    public void testNuevaPersona() throws Exception {
    }

    /**
     * Test of comprobarNick method, of class Sistema.
     */
    @Test
    public void testComprobarNick() {
    }

    /**
     * Test of darBajaJ method, of class Sistema.
     */
    @Test
    public void testDarBajaJ() throws Exception {
    }

    /**
     * Test of darBajaO method, of class Sistema.
     */
    @Test
    public void testDarBajaO() throws Exception {
    }

    /**
     * Test of devolucionUsuario method, of class Sistema.
     */
    @Test
    public void testDevolucionUsuario() {
    }

    /**
     * Test of devolucionOperador method, of class Sistema.
     */
    @Test
    public void testDevolucionOperador() {
    }

    /**
     * Test of guardarDatos method, of class Sistema.
     */
    @Test
    public void testGuardarDatos() throws Exception {
    }

    /**
     * Test of getArmaduraList method, of class Sistema.
     */
    @Test
    public void testGetArmaduraList() {
    }

    /**
     * Test of Banear method, of class Sistema.
     */
    @Test
    public void testBanear() {
    }

    /**
     * Test of desBanear method, of class Sistema.
     */
    @Test
    public void testDesBanear() {
    }

    /**
     * Test of desafiar method, of class Sistema.
     */
    @Test
    public void testDesafiar() {
    }

    /**
     * Test of aceptarDesafio method, of class Sistema.
     */
    @Test
    public void testAceptarDesafio() {
    }
    
}
