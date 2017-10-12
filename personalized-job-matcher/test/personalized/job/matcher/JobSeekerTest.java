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
public class JobSeekerTest {
    
    public JobSeekerTest() {
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
     * Test of getFirstName method, of class JobSeeker.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        JobSeeker instance = new JobSeeker("Bob", "Smith",1, "1234");
        String expResult = "Bob";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class JobSeeker.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        JobSeeker instance = new JobSeeker("Bob", "Smith",1, "1234");
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class JobSeeker.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        JobSeeker instance = new JobSeeker("Bob", "Smith", 1, "1234");
        String expResult = "Smith";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class JobSeeker.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        JobSeeker instance = new JobSeeker("Bob", "Smith", 1, "1234");
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProfile method, of class JobSeeker.
     */
    @Test
    public void testGetProfile() {
        System.out.println("getProfile");
        JobSeeker instance = new JobSeeker("Bob", "Smith",1 , "1234");
        int expResult = 1234;
        int result = instance.getProfile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProfile method, of class JobSeeker.
     */
    @Test
    public void testSetProfile() {
        System.out.println("setProfile");
        int profile = 0;
        JobSeeker instance = new JobSeeker("Bob", "Smith", 1, "1234");
        instance.setProfile(profile);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
