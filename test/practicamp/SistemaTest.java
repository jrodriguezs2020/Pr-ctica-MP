/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import java.util.ArrayList;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SistemaTest {
    
    public SistemaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inicio method, of class Sistema.
     */
    @Test
    public void testInicio() throws Exception {
        System.out.println("inicio");
        Sistema instance = new Sistema();
        instance.inicio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArmaList method, of class Sistema.
     */
    @Test
    public void testGetArmaList() {
        System.out.println("getArmaList");
        Sistema instance = new Sistema();
        ArrayList<Arma> expResult = null;
        ArrayList<Arma> result = instance.getArmaList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuariosList method, of class Sistema.
     */
    @Test
    public void testGetUsuariosList() {
        System.out.println("getUsuariosList");
        Sistema instance = new Sistema();
        ArrayList<Jugador> expResult = null;
        ArrayList<Jugador> result = instance.getUsuariosList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ranking method, of class Sistema.
     */
    @Test
    public void testRanking() {
        System.out.println("ranking");
        Sistema instance = new Sistema();
        TreeSet<Jugador> expResult = null;
        TreeSet<Jugador> result = instance.ranking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of personaCorrecta method, of class Sistema.
     */
    @Test
    public void testPersonaCorrecta() {
        System.out.println("personaCorrecta");
        String nick = "";
        String contraseña = "";
        int modo = 0;
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.personaCorrecta(nick, contraseña, modo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevaPersona method, of class Sistema.
     */
    @Test
    public void testNuevaPersona() throws Exception {
        System.out.println("nuevaPersona");
        String nombre = "";
        String nick = "";
        String contraseña = "";
        int modo = 0;
        Sistema instance = new Sistema();
        Usuario expResult = null;
        Usuario result = instance.nuevaPersona(nombre, nick, contraseña, modo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarNick method, of class Sistema.
     */
    @Test
    public void testComprobarNick() {
        System.out.println("comprobarNick");
        String nick = "";
        int modo = 0;
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.comprobarNick(nick, modo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of darBajaJ method, of class Sistema.
     */
    @Test
    public void testDarBajaJ() throws Exception {
        System.out.println("darBajaJ");
        Jugador usuario = null;
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.darBajaJ(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of darBajaO method, of class Sistema.
     */
    @Test
    public void testDarBajaO() throws Exception {
        System.out.println("darBajaO");
        Operador usuario = null;
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.darBajaO(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolucionUsuario method, of class Sistema.
     */
    @Test
    public void testDevolucionUsuario() {
        System.out.println("devolucionUsuario");
        String nick = "";
        Sistema instance = new Sistema();
        Jugador expResult = null;
        Jugador result = instance.devolucionUsuario(nick);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolucionOperador method, of class Sistema.
     */
    @Test
    public void testDevolucionOperador() {
        System.out.println("devolucionOperador");
        String nick = "";
        Sistema instance = new Sistema();
        Operador expResult = null;
        Operador result = instance.devolucionOperador(nick);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarDatos method, of class Sistema.
     */
    @Test
    public void testGuardarDatos() throws Exception {
        System.out.println("guardarDatos");
        Sistema instance = new Sistema();
        instance.guardarDatos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArmaduraList method, of class Sistema.
     */
    @Test
    public void testGetArmaduraList() {
        System.out.println("getArmaduraList");
        Sistema instance = new Sistema();
        ArrayList<Armadura> expResult = null;
        ArrayList<Armadura> result = instance.getArmaduraList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Banear method, of class Sistema.
     */
    @Test
    public void testBanear() {
        System.out.println("Banear");
        String nick = "";
        Sistema instance = new Sistema();
        instance.Banear(nick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desBanear method, of class Sistema.
     */
    @Test
    public void testDesBanear() {
        System.out.println("desBanear");
        String nick = "";
        Sistema instance = new Sistema();
        instance.desBanear(nick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desafiar method, of class Sistema.
     */
    @Test
    public void testDesafiar() {
        System.out.println("desafiar");
        Jugador jDesafiado = null;
        Jugador jDesafiante = null;
        int oroApostado = 0;
        Sistema instance = new Sistema();
        instance.desafiar(jDesafiado, jDesafiante, oroApostado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aceptarDesafio method, of class Sistema.
     */
    @Test
    public void testAceptarDesafio() {
        System.out.println("aceptarDesafio");
        Sistema instance = new Sistema();
        instance.aceptarDesafio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
