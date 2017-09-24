
package personalized.job.matcher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class ChoiceTest {
    
    public ChoiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getChoiceID method, of class Choice.
     */
    @Test
    public void testGetChoiceID() {
        System.out.println("getChoiceID");
        Choice instance = new Choice(1, "Red");
        int expResult = 1;
        int result = instance.getChoiceID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setChoiceID method, of class Choice.
     */
    @Test
    public void testSetChoiceID() {
        System.out.println("setChoiceID");
        int choiceID = 0;
        Choice instance = new Choice(1, "Red");
        instance.setChoiceID(choiceID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getChoiceText method, of class Choice.
     */
    @Test
    public void testGetChoiceText() {
        System.out.println("getChoiceText");
        Choice instance = new Choice(1, "Red");
        String expResult = "Red";
        String result = instance.getChoiceText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setChoiceText method, of class Choice.
     */
    @Test
    public void testSetChoiceText() {
        System.out.println("setChoiceText");
        String choiceText = "Blue";
        Choice instance = new Choice(1, "Red");
        instance.setChoiceText(choiceText);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
