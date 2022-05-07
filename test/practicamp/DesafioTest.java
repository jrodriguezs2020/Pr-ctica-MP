
package practicamp;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DesafioTest {
    private Desafio desafio0;
    private Desafio desafio1;
    private Desafio desafio2;
    private Desafio desafio3;
    private Desafio desafio4;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;
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
        jugador1 = new Jugador("jugador","des1","contraseña");
        Personaje personaje1 = new Personaje(); 
        personaje1.setSalud(0);
        jugador1.setPersonaje(personaje1);
        jugador2= new Jugador("jugador","desaf1","contraseña");
        ConcreteCreatorCazador createCaz = new ConcreteCreatorCazador();
        Personaje personaje2 = new Personaje();
        personaje2 = (ConcreteCazador) createCaz.CreatePersonaje();
        jugador2.setPersonaje(personaje2);
        jugador3 = new Jugador("jugador","des2","contraseña");
        ConcreteCreatorCazador createCaz2 = new ConcreteCreatorCazador();
        Personaje personaje3 = new Personaje();
        personaje3 = (ConcreteCazador) createCaz2.CreatePersonaje();
        jugador3.setPersonaje(personaje3);
        Ghoul g1 =new Ghoul();
        Demonio d1 =new Demonio();
        Humano h1 =new Humano();
        personaje3.getEsbirroList().add(g1);
        personaje3.getEsbirroList().add(d1);
        personaje3.getEsbirroList().add(h1);
        jugador4 = new Jugador("jugador","des2","contraseña");
        ConcreteCreatorCazador createCaz3 = new ConcreteCreatorCazador();
        Personaje personaje4 = new Personaje();
        personaje4 = (ConcreteCazador) createCaz3.CreatePersonaje();
        jugador4.setPersonaje(personaje4);
        personaje4.getEsbirroList().add(g1);
        personaje4.getEsbirroList().add(d1);
        personaje4.getEsbirroList().add(h1);
        jugador3.getPersonaje().setSalud(5);
        jugador4.getPersonaje().setSalud(5);
       /* Jugador jugador5 = new Jugador("jugador","des3","contraseña");
        Jugador jugador6= new Jugador("jugador","desaf3","contraseña");
        Jugador jugador7 = new Jugador("jugador","des4","contraseña");
        Jugador jugador8= new Jugador("jugador","desaf4","contraseña");*/
        desafio0= new Desafio(jugador1,jugador1,20);
        desafio1 = new Desafio(jugador1,jugador2,20);
        desafio2 = new Desafio(jugador2,jugador1,20);
        desafio3 = new Desafio(jugador3,jugador4,20);
        desafio4 = new Desafio(jugador2,jugador3,20);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of combate method, of class Desafio.
     */
    @Test
    public void testCombate() {
        desafio0.combate();
        desafio1.combate();
        desafio2.combate();
        desafio3.combate();
        desafio4.combate();
        boolean expResultF = false;
        boolean expResultV = true;
        boolean result0=(jugador1.getNotificaciones().isEmpty()); //no se puede ejecutar ya que est contra uno mismo
        boolean result1=(jugador1.getNotificaciones().isEmpty());
        boolean result1_1=(jugador2.getNotificaciones().isEmpty());
        boolean result2=(jugador1.getNotificaciones().isEmpty());
        boolean result2_1=(jugador2.getNotificaciones().isEmpty());
        boolean result3=!(jugador3.getNotificaciones().isEmpty());
        boolean result3_1 = !(jugador4.getNotificaciones().isEmpty());
        boolean result4=!(jugador3.getNotificaciones().isEmpty());
        boolean result4_1 = !(jugador2.getNotificaciones().isEmpty());
        
       
        assertEquals(expResultF,result0);
        assertEquals(expResultF,result1);
        assertEquals(expResultF,result1_1);
        assertEquals(expResultF,result2);
        assertEquals(expResultF,result2_1);
        assertEquals(expResultV,result3);
        assertEquals(expResultV,result3_1);
        assertEquals(expResultV,result4);
        assertEquals(expResultV,result4_1);
        
    }


}
