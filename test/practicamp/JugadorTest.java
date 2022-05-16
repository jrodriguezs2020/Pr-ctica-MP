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
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;
    private Jugador jugador5;
    private Jugador jugador6;
    
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
        jugador1 = new Jugador("Nombre","nick2","contraseña");
        jugador2 = new Jugador("Nombre","nick3","contraseña");
        Personaje personaje = new Personaje();
        jugador2.setPersonaje(personaje);
        jugador3 = new Jugador("Nombre","nick4","contraseña");
        Personaje personaje2 = new Personaje();
        personaje2.setCantidadOro(200);
        jugador3.setPersonaje(personaje2);
        Desafio desafio = new Desafio(jugador3,jugador4,100);
        desafio.setVencedor(null);
        jugador3.getDesafios().add(desafio);
        jugador3.getDesafiosJ().add(desafio);
        jugador4 = new Jugador("Nombre","nick4","contraseña");
        jugador4.setPersonaje(personaje);
        jugador4.getDesafios().add(desafio);
        jugador5 = new Jugador("Nombre","nick5","contraseña");
        jugador6 = new Jugador("Nombre","nick6","contraseña");
        Desafio desafio2 = new Desafio(jugador5,jugador6,100);
        desafio2.setValidado(true);
        desafio2.setVencedor(jugador5);
        jugador5.getDesafios().add(desafio2);
        jugador6.getDesafios().add(desafio2);
        jugador5.getDesafiosJ().add(desafio2);
        jugador6.getDesafiosJ().add(desafio2);
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of compareTo method, of class Jugador.
     */
    @Test
    public void testCompareTo() {
        int result1 = jugador1.compareTo(jugador1);
        int result2 = jugador1.compareTo(jugador2);
        int result3 = jugador2.compareTo(jugador1);
        int result4 = jugador2.compareTo(jugador3);
        int result5 = jugador3.compareTo(jugador2);
        int result6 = jugador4.compareTo(jugador2);
        
        assertEquals(0,result1);
        assertEquals(1,result2);
        assertEquals(-1,result3);
        assertEquals(-1,result4);
        assertEquals(1,result5);
        assertEquals(1,result6);
    }

    /**
     * Test of desafioPendiente method, of class Jugador.
     */
    @Test
    public void testDesafioPendiente() {
        boolean expResultF = false;
        boolean expResultV = true;
        
        boolean result1 = jugador1.desafioPendiente();
        boolean result2 = jugador2.desafioPendiente();
        boolean result3 = jugador3.desafioPendiente();
        boolean result4 = jugador4.desafioPendiente();
        boolean result5 = jugador5.desafioPendiente();
        boolean result6 = jugador6.desafioPendiente();
        
        assertEquals(expResultF, result1);
        assertEquals(expResultF, result2);
        assertEquals(expResultF, result3);
        assertEquals(expResultF, result4);
        assertEquals(expResultV, result5);
        assertEquals(expResultF, result6);
        
    }

    /**
     * Test of comprobarNorma method, of class Jugador.
     */
    @Test
    public void testComprobarNorma() {
        boolean expResultF = false;
        boolean expResultV = true;
        
        boolean result1 = jugador1.comprobarNorma();
        boolean result2 = jugador3.comprobarNorma();
        boolean result3 = jugador5.comprobarNorma();
        boolean result4 = jugador6.comprobarNorma();
        
        assertEquals(expResultV, result1);
        assertEquals(expResultV, result2);
        assertEquals(expResultV, result3);
        assertEquals(expResultF, result4);
    }
    
}
