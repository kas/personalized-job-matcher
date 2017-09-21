/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized_job_matcher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kas
 */
public class UserTest {
	
	public UserTest() {
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
	 * Test of authenticate method, of class User.
	 */
	@Test
	public void testAuthenticate() {
		System.out.println("authenticate");
		String username = "testusername";
		String password = "testpassword";
		User instance = new User("testusername", "testpassword");
		boolean expResult = true;
		boolean result = instance.authenticate(username, password);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		// fail("The test case is a prototype.");
	}

	/**
	 * Test of getUsername method, of class User.
	 */
	@Test
	public void testGetUsername() {
		System.out.println("getUsername");
		User instance = new User("testusername", "testpassword");
		String expResult = "testusername";
		String result = instance.getUsername();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		// fail("The test case is a prototype.");
	}

	/**
	 * Test of setUsername method, of class User.
	 */
	@Test
	public void testSetUsername() {
		System.out.println("setUsername");
		String username = "";
		User instance = null;
		instance.setUsername(username);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getPassword method, of class User.
	 */
	@Test
	public void testGetPassword() {
		System.out.println("getPassword");
		User instance = null;
		String expResult = "";
		String result = instance.getPassword();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setPassword method, of class User.
	 */
	@Test
	public void testSetPassword() {
		System.out.println("setPassword");
		String password = "";
		User instance = null;
		instance.setPassword(password);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
