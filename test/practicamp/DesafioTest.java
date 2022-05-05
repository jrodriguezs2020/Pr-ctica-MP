/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victo
 */
public class DesafioTest {
    
    public DesafioTest() {
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
     * Test of isTerminado method, of class Desafio.
     */
    @Test
    public void testIsTerminado() {
        System.out.println("isTerminado");
        Desafio instance = null;
        boolean expResult = false;
        boolean result = instance.isTerminado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTerminado method, of class Desafio.
     */
    @Test
    public void testSetTerminado() {
        System.out.println("setTerminado");
        boolean terminado = false;
        Desafio instance = null;
        instance.setTerminado(terminado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOroApostado method, of class Desafio.
     */
    @Test
    public void testGetOroApostado() {
        System.out.println("getOroApostado");
        Desafio instance = null;
        int expResult = 0;
        int result = instance.getOroApostado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVencedor method, of class Desafio.
     */
    @Test
    public void testGetVencedor() {
        System.out.println("getVencedor");
        Desafio instance = null;
        Jugador expResult = null;
        Jugador result = instance.getVencedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVencedor method, of class Desafio.
     */
    @Test
    public void testSetVencedor() {
        System.out.println("setVencedor");
        Jugador vencedor = null;
        Desafio instance = null;
        instance.setVencedor(vencedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidado method, of class Desafio.
     */
    @Test
    public void testIsValidado() {
        System.out.println("isValidado");
        Desafio instance = null;
        boolean expResult = false;
        boolean result = instance.isValidado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValidado method, of class Desafio.
     */
    @Test
    public void testSetValidado() {
        System.out.println("setValidado");
        boolean validado = false;
        Desafio instance = null;
        instance.setValidado(validado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesafiado method, of class Desafio.
     */
    @Test
    public void testGetDesafiado() {
        System.out.println("getDesafiado");
        Desafio instance = null;
        Jugador expResult = null;
        Jugador result = instance.getDesafiado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesafiante method, of class Desafio.
     */
    @Test
    public void testGetDesafiante() {
        System.out.println("getDesafiante");
        Desafio instance = null;
        Jugador expResult = null;
        Jugador result = instance.getDesafiante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRondas method, of class Desafio.
     */
    @Test
    public void testGetRondas() {
        System.out.println("getRondas");
        Desafio instance = null;
        int expResult = 0;
        int result = instance.getRondas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRondas method, of class Desafio.
     */
    @Test
    public void testSetRondas() {
        System.out.println("setRondas");
        int rondas = 0;
        Desafio instance = null;
        instance.setRondas(rondas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOroGanado method, of class Desafio.
     */
    @Test
    public void testGetOroGanado() {
        System.out.println("getOroGanado");
        Desafio instance = null;
        int expResult = 0;
        int result = instance.getOroGanado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOroGanado method, of class Desafio.
     */
    @Test
    public void testSetOroGanado() {
        System.out.println("setOroGanado");
        int oroGanado = 0;
        Desafio instance = null;
        instance.setOroGanado(oroGanado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Desafio.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Desafio instance = null;
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of combate method, of class Desafio.
     */
    @Test
    public void testCombate() {
        System.out.println("combate");
        Desafio instance = null;
        instance.combate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rechazar method, of class Desafio.
     */
    @Test
    public void testRechazar() {
        System.out.println("rechazar");
        Desafio instance = null;
        instance.rechazar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notificar method, of class Desafio.
     */
    @Test
    public void testNotificar() {
        System.out.println("notificar");
        Desafio instance = null;
        instance.notificar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
