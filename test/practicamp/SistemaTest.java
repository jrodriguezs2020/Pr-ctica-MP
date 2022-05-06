/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import static com.sun.source.util.DocTrees.instance;
import static com.sun.source.util.DocTrees.instance;
import static com.sun.source.util.JavacTask.instance;
import static com.sun.source.util.Trees.instance;
import static com.sun.source.util.Trees.instance;
import static com.sun.source.util.Trees.instance;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author javii
 */
public class SistemaTest {
    private Sistema sistema;
    
    public SistemaTest() {
    }
    
    @Before
    public void setUp() {
        ArrayList <Jugador> usuariosList = new ArrayList();
        ArrayList <Operador> operadoresList = new ArrayList();
        Jugador j1 = new Jugador("Nombre","nick1","contraseña");
        Jugador j2 = new Jugador("Nombre","Nick1","contraseña");
        Jugador j3 = new Jugador("Nombre3","nick3","contraseña3");
        Jugador j4 = new Jugador("N0mbre.","nick$","contra$eña.");
        Operador op1 = new Operador("Nombre","nick1","contraseña");
        Operador op2 = new Operador("Nombre","Nick1","contraseña");
        Operador op3 = new Operador("Nombre3","nick3","contraseña3");
        Operador op4 = new Operador("N0mbre","nick$","contra$eña.");
        usuariosList.add(j1);
        usuariosList.add(j2);
        usuariosList.add(j3);
        usuariosList.add(j4);
        operadoresList.add(op1);
        operadoresList.add(op2);
        operadoresList.add(op3);
        operadoresList.add(op4);
        sistema = new Sistema(usuariosList,operadoresList);
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
        //Jugadores:
        String nick1 = "nick1";
        String contraseña1 = "contraseña";
        String nick2 = "Nick1";
        String contraseña2 = "Contraseña";
        String nick3 = "Nick3";
        String contraseña3 = "contraseña3";
        String nick4 = "nick$";
        String contraseña4 = "contra$eña.";
        //Operadores:
        String nick5 = "nick1";
        String contraseña5 = "contraseña1";
        String nick6 = "nick1";
        String contraseña6 = "contraseña";
        String nick7 = "nick3";
        String contraseña7 = "contraseña";
        String nick8 = "nick$";
        String contraseña8 = "contra$eña";
        
        int modoO = 0;
        int modoJ = 1;
        boolean expResultF = false;
        boolean expResultV = true;
        boolean result1 = sistema.personaCorrecta(nick1, contraseña1, modoJ);
        boolean result2 = sistema.personaCorrecta(nick2, contraseña2, modoJ);
        boolean result3 = sistema.personaCorrecta(nick3, contraseña3, modoJ);
        boolean result4 = sistema.personaCorrecta(nick4, contraseña4, modoJ);
        boolean result5 = sistema.personaCorrecta(nick5, contraseña5, modoO);
        boolean result6 = sistema.personaCorrecta(nick6, contraseña6, modoO);
        boolean result7 = sistema.personaCorrecta(nick7, contraseña7, modoO);
        boolean result8 = sistema.personaCorrecta(nick8, contraseña8, modoO);
        assertEquals(expResultV, result1);
        assertEquals(expResultF, result2);
        assertEquals(expResultF, result3);
        assertEquals(expResultV, result4);
        assertEquals(expResultF, result5);
        assertEquals(expResultV, result6);
        assertEquals(expResultF, result7);
        assertEquals(expResultF, result8);
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
