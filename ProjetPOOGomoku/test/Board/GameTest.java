/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;


/**
 *
 * @author romai
 */
public class GameTest {
   
    /**
     * Test of partieFinie method, of class Game.
     */
    @Test
    public void testPartieFinie() {
        
    }

    /**
     * Test of posePion method, of class Game.
     */
    @Test
    public void testPosePion() {
        Position p = new Position(3, 4);
        int expResult = 4;
        int result = p.Col();
        assertEquals(expResult,result);
    }
}
