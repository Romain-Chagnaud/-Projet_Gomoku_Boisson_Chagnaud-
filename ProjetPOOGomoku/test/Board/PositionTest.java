/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;


import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertEquals;

/**
 *
 * @author romai
 */
public class PositionTest {
    
    

    /**
     * Test of voisines method, of class Position.
     */
    @Test
    public void testVoisines() {
        Position p = new Position(3, 'A');
        
        assertEquals(p, null); // remplacer nul par autre chose 
    }

    /**
     * Test of caseVide method, of class Position.
     */
    @Test
    public void testCaseVide() {
       
    }
  
}
