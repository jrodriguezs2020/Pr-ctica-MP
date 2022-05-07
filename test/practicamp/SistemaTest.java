/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
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
        Jugador j1 = new Jugador ("Nombre", "nick1", "contraseña");
        boolean result1 = sistema.getUsuariosList().contains(j1);
        boolean expResultV = true;
        boolean expResultF = false;
        assertEquals(expResultV, result1);
    }

    /**
     * Test of ranking method, of class Sistema.
     */
    @Test
    public void testRanking() {
        Jugador j1 = new Jugador ("Nombre", "nickRanking", "contraseña");
        Personaje personaje = new Personaje();
        j1.setPersonaje(personaje);
        sistema.getUsuariosList().add(j1);
        TreeSet ranking = sistema.ranking();
        Jugador j1Ranking = (Jugador) ranking.first();
        assertSame(j1, j1Ranking);
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
        Jugador j1 = (Jugador) sistema.nuevaPersona("Nombre", "nickJ", "contraseña", 1);
        Operador op1 = (Operador) sistema.nuevaPersona("Nombre", "nickO", "contraseña", 0);
        boolean result1 = sistema.getUsuariosList().contains(j1);
        boolean result2 = sistema.getOperadorList().contains(op1);
        boolean result3 = sistema.getUsuariosList().contains(op1);
        boolean result4 = sistema.getOperadorList().contains(j1);
        boolean expResultF = false;
        boolean expResultV = true;
        assertEquals(expResultV, result1);
        assertEquals(expResultV, result2);
        assertEquals(expResultF, result3);
        assertEquals(expResultF, result4);
    }

    /**
     * Test of comprobarNick method, of class Sistema.
     */
    @Test
    public void testComprobarNick() {
        //Jugadores:
        String nick1 = "nick$.";
        String nick2 = "Nick1";
        String nick3 = "Nick3";
        String nick4 = "nick$";
        //Operadores:
        String nick5 = "nick1";
        String nick6 = "nick;";
        String nick7 = "Nick3";
        String nick8 = "nick$";
        
        int modoO = 0;
        int modoJ = 1;
        boolean expResultF = false;
        boolean expResultV = true;
        boolean result1 = sistema.comprobarNick(nick1, modoJ);
        boolean result2 = sistema.comprobarNick(nick2, modoJ);
        boolean result3 = sistema.comprobarNick(nick3, modoJ);
        boolean result4 = sistema.comprobarNick(nick4, modoJ);
        boolean result5 = sistema.comprobarNick(nick5, modoO);
        boolean result6 = sistema.comprobarNick(nick6, modoO);
        boolean result7 = sistema.comprobarNick(nick7, modoO);
        boolean result8 = sistema.comprobarNick(nick8, modoO);
        assertEquals(expResultF, result1);
        assertEquals(expResultV, result2);
        assertEquals(expResultF, result3);
        assertEquals(expResultV, result4);
        assertEquals(expResultV, result5);
        assertEquals(expResultF, result6);
        assertEquals(expResultF, result7);
        assertEquals(expResultV, result8);
    }

    /**
     * Test of darBajaJ method, of class Sistema.
     */
    @Test
    public void testDarBajaJ() throws Exception {
        Jugador j1 = new Jugador ("Nombre", "nick1", "contraseña");
        boolean result1 = sistema.darBajaJ(j1);
        boolean expResultV = true;
        boolean expResultF = false;
        assertEquals(expResultV, result1); //si se elimina bien
        boolean result2 = sistema.getUsuariosList().contains(j1);
        assertEquals (expResultF, result2); //si sigue en el array
    }

    /**
     * Test of darBajaO method, of class Sistema.
     */
    @Test
    public void testDarBajaO() throws Exception {
        Operador op1 = new Operador ("Nombre", "nick1", "contraseña");
        boolean result1 = sistema.darBajaO(op1);
        boolean expResultV = true;
        boolean expResultF = false;
        assertEquals(expResultV, result1); //si se elimina bien
        boolean result2 = sistema.getOperadorList().contains(op1);
        assertEquals (expResultF, result2); //si sigue en el array
    }

    /**
     * Test of devolucionUsuario method, of class Sistema.
     */
    @Test
    public void testDevolucionUsuario() {
        Jugador j1 = new Jugador ("Nombre","Nick$$","contra$eña.");
        sistema.getUsuariosList().add(j1);
        String nick1 = "Nick$$";
        Jugador result1 = sistema.devolucionUsuario(nick1);
        boolean expResultF = false;
        assertSame(j1, result1);
    }

    /**
     * Test of devolucionOperador method, of class Sistema.
     */
    @Test
    public void testDevolucionOperador() {
        Operador op1 = new Operador ("Nombre","Nick$$","contra$eña.");
        sistema.getOperadorList().add(op1);
        String nick1 = "Nick$$";
        String nick2 = "nick";
        Operador result1 = sistema.devolucionOperador(nick1);
        Operador result2 = sistema.devolucionOperador(nick2);
        assertNull(result2);
        assertSame(op1, result1);
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
    public void testBanear() throws IOException {
        Jugador j1 = new Jugador ("Nombre", "nickBanear", "contraseña");
        sistema.getUsuariosList().add(j1);
        String nick = j1.getNick();
        sistema.Banear(nick);
        boolean result1 = j1.isBaneado();
        boolean expResultV = true;
        boolean expResultF = false;
        assertEquals(expResultV, result1);
    }

    /**
     * Test of desBanear method, of class Sistema.
     */
    @Test
    public void testDesBanear() {
        //Caso 1
        Jugador j1 = new Jugador ("Nombre", "nickDesBanear", "contraseña");
        sistema.getUsuariosList().add(j1);
        String nick = j1.getNick();
        sistema.Banear(nick);
        boolean result1 = j1.isBaneado();
        boolean expResultV = true;
        boolean expResultF = false;
        assertEquals(expResultV, result1); //comprueba que está baneado
        sistema.desBanear(nick);
        boolean result2 = j1.isBaneado();
        assertEquals(expResultF, result2); //comprueba que se ha desbaneado
        //Caso 2
        Jugador j2 = new Jugador ("Nombre", "nickDesBanear2", "contraseña");
        sistema.getUsuariosList().add(j2);
        String nick2 = j2.getNick();
        boolean result3 = j2.isBaneado();
        assertEquals(expResultF, result3);
    }

    /**
     * Test of desafiar method, of class Sistema.
     */
    @Test
    public void testDesafiar() {
        Jugador j1 = new Jugador ("Nombre", "desafiante", "contraseña");
        Jugador j2 = new Jugador ("Nombre", "desafiado", "contraseña");
        int oroApostado = 10;
        sistema.desafiar(j1, j2, oroApostado);
        Desafio desafio1 = j1.getDesafios().get(0);
        Desafio desafio2 = j2.getDesafios().get(0);
        assertSame(desafio1,desafio2);
        assertNotNull(desafio1);
    }

    /**
     * Test of aceptarDesafio method, of class Sistema.
     */
    @Test
    public void testAceptarDesafio() {
    }
    
}
