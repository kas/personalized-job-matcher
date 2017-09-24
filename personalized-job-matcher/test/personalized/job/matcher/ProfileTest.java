/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christian Kim
 */
public class ProfileTest {
    
    private Personality personality;
    
    public ProfileTest() {
        personality = new Personality(1234, "enfp");
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
     * Test of getPersonality method, of class Profile.
     */
    @Test
    public void testGetPersonality() {
        System.out.println("getPersonality");
        Profile instance = new Profile(1234, this.personality, 21);
        Personality expResult = this.personality;
        Personality result = instance.getPersonality();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonality method, of class Profile.
     */
    @Test
    public void testSetPersonality() {
        System.out.println("setPersonality");
        Personality personality = null;
        Profile instance = new Profile(1234, this.personality, 21);
        instance.setPersonality(personality);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Profile.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Profile instance = new Profile(1234, this.personality, 21);
        int expResult = 21;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Profile.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Profile instance = new Profile(1234, this.personality, 21);
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Profile.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Profile instance = new Profile(1234, this.personality, 21);
        int expResult = 1234;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Profile.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Profile instance = new Profile(1234, this.personality, 21);
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
