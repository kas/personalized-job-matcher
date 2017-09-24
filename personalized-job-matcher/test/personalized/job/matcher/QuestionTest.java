
package personalized.job.matcher;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class QuestionTest {
    
    public QuestionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getQuestionID method, of class Question.
     */
    @Test
    public void testGetQuestionID() {
        System.out.println("getQuestionID");
        Question instance = new Question(1,"What is your favorite color?");
        int expResult = 1;
        int result = instance.getQuestionID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestionID method, of class Question.
     */
    @Test
    public void testSetQuestionID() {
        System.out.println("setQuestionID");
        int questionID = 0;
        Question instance = new Question(1,"What is your favorite color?");
        instance.setQuestionID(questionID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionText method, of class Question.
     */
    @Test
    public void testGetQuestionText() {
        System.out.println("getQuestionText");
        Question instance = new Question(1,"What is your favorite color?");
        String expResult = "What is your favorite color?";
        String result = instance.getQuestionText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestionText method, of class Question.
     */
    @Test
    public void testSetQuestionText() {
        System.out.println("setQuestionText");
        String questionText = "Is this a new question?";
        Question instance = new Question(1,"What is your favorite color?");
        instance.setQuestionText(questionText);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionInfo method, of class Question.
     */
    @Test
    public void testGetQuestionInfo() {
        System.out.println("getQuestionInfo");
        Question instance = new Question(1,"What is your favorite color?");
        instance.getQuestionInfo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of makeChoices method, of class Question.
     */
    @Test
    public void testMakeChoices() {
        System.out.println("makeChoices");
        Question instance = new Question(1,"What is your favorite color?");
        instance.makeChoices();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addChoices method, of class Question.
     */
    @Test
    public void testAddChoices() {
        System.out.println("addChoices");
        Question instance = new Question(1,"What is your favorite color?");
        instance.addChoices();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
