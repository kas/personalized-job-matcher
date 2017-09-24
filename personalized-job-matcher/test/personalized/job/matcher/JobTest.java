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
public class JobTest {
    
    public JobTest() {
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
     * Test of getJobID method, of class Job.
     */
    @Test
    public void testGetJobID() {
        System.out.println("getJobID");
        Job instance = new Job(1234, "Internship", 2119);
        int expResult = 1234;
        int result = instance.getJobID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setJobID method, of class Job.
     */
    @Test
    public void testSetJobID() {
        System.out.println("setJobID");
        int jobID = 0;
        Job instance = new Job(1234, "Internship", 2119);
        instance.setJobID(jobID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getJobType method, of class Job.
     */
    @Test
    public void testGetJobType() {
        System.out.println("getJobType");
        Job instance = new Job(1234, "Internship", 2119);
        String expResult = "Internship";
        String result = instance.getJobType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setJobType method, of class Job.
     */
    @Test
    public void testSetJobType() {
        System.out.println("setJobType");
        String jobType = "";
        Job instance = new Job(1234, "Internship", 2119);
        instance.setJobType(jobType);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployer method, of class Job.
     */
    @Test
    public void testGetEmployer() {
        System.out.println("getEmployer");
        Job instance = new Job(1234, "Internship", 2119);
        int expResult = 2119;
        int result = instance.getEmployer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployer method, of class Job.
     */
    @Test
    public void testSetEmployer() {
        System.out.println("setEmployer");
        int employer = 0;
        Job instance = new Job(1234, "Internship", 2119);
        instance.setEmployer(employer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
