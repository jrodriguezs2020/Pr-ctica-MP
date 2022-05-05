/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamp;

import java.util.ArrayList;
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
public class JugadorTest {
    
    public JugadorTest() {
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
     * Test of isNorma method, of class Jugador.
     */
    @Test
    public void testIsNorma() {
        System.out.println("isNorma");
        Jugador instance = null;
        boolean expResult = false;
        boolean result = instance.isNorma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNorma method, of class Jugador.
     */
    @Test
    public void testSetNorma() {
        System.out.println("setNorma");
        boolean norma = false;
        Jugador instance = null;
        instance.setNorma(norma);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotificaciones method, of class Jugador.
     */
    @Test
    public void testGetNotificaciones() {
        System.out.println("getNotificaciones");
        Jugador instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getNotificaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotificaciones method, of class Jugador.
     */
    @Test
    public void testSetNotificaciones() {
        System.out.println("setNotificaciones");
        ArrayList<String> notificaciones = null;
        Jugador instance = null;
        instance.setNotificaciones(notificaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesafiosJ method, of class Jugador.
     */
    @Test
    public void testGetDesafiosJ() {
        System.out.println("getDesafiosJ");
        Jugador instance = null;
        ArrayList<Desafio> expResult = null;
        ArrayList<Desafio> result = instance.getDesafiosJ();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesafios method, of class Jugador.
     */
    @Test
    public void testGetDesafios() {
        System.out.println("getDesafios");
        Jugador instance = null;
        ArrayList<Desafio> expResult = null;
        ArrayList<Desafio> result = instance.getDesafios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBaneado method, of class Jugador.
     */
    @Test
    public void testSetBaneado() {
        System.out.println("setBaneado");
        boolean baneado = false;
        Jugador instance = null;
        instance.setBaneado(baneado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBaneado method, of class Jugador.
     */
    @Test
    public void testIsBaneado() {
        System.out.println("isBaneado");
        Jugador instance = null;
        boolean expResult = false;
        boolean result = instance.isBaneado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonaje method, of class Jugador.
     */
    @Test
    public void testGetPersonaje() {
        System.out.println("getPersonaje");
        Jugador instance = null;
        Personaje expResult = null;
        Personaje result = instance.getPersonaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonaje method, of class Jugador.
     */
    @Test
    public void testSetPersonaje() {
        System.out.println("setPersonaje");
        Personaje personaje = null;
        Jugador instance = null;
        instance.setPersonaje(personaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Jugador.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object jug = null;
        Jugador instance = null;
        int expResult = 0;
        int result = instance.compareTo(jug);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desafioPendiente method, of class Jugador.
     */
    @Test
    public void testDesafioPendiente() {
        System.out.println("desafioPendiente");
        Jugador instance = null;
        boolean expResult = false;
        boolean result = instance.desafioPendiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Jugador.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Jugador instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarNorma method, of class Jugador.
     */
    @Test
    public void testComprobarNorma() {
        System.out.println("comprobarNorma");
        Jugador instance = null;
        boolean expResult = false;
        boolean result = instance.comprobarNorma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
