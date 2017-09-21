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
 * @author kas
 */
public class PersonalityTest {
	public PersonalityTest() {
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
	 * Test of getId method, of class Personality.
	 */
	@Test
	public void testGetId() {
		System.out.println("getId");
		Personality instance = new Personality(0, "rambunctious");
		int expResult = 0;
		int result = instance.getId();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setId method, of class Personality.
	 */
	@Test
	public void testSetId() {
		System.out.println("setId");
		int id = 1;
		Personality instance = new Personality(0, "rambunctious");
		instance.setId(id);
		int result = instance.getId();
		assertEquals(id, result);
	}

	/**
	 * Test of getType method, of class Personality.
	 */
	@Test
	public void testGetType() {
		System.out.println("getType");
		Personality instance = new Personality(0, "rambunctious");
		String expResult = "rambunctious";
		String result = instance.getType();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setType method, of class Personality.
	 */
	@Test
	public void testSetType() {
		System.out.println("setType");
		String type = "rambunctious";
		Personality instance = new Personality(0, "rambunctious");
		instance.setType(type);
		String result = instance.getType();
		assertEquals(type, result);
	}
}

