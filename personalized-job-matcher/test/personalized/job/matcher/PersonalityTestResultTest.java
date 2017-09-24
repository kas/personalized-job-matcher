/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.util.ArrayList;
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
public class PersonalityTestResultTest {
	private ArrayList<Personality> personalities;
	private ArrayList<UserChoice> userChoices;

	public PersonalityTestResultTest() {
		Personality personality = new Personality(0, "rambunctious");
		
		ArrayList<Personality> personalities = new ArrayList<Personalities>();
		personalities.add(personality);

		this.personalities = personalities;

		// TODO
		UserChoice userChoice = new UserChoice();

		this.userChoices = userChoices;
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
	 * Test of getUserChoices method, of class PersonalityTestResult.
	 */
	@Test
	public void testGetUserChoices() {
		System.out.println("getUserChoices");
		PersonalityTestResult instance = new PersonalityTestResult(this.userChoices, this.personalities);
		// TODO
		ArrayList<UserChoice> expResult = this.userChoices;
		ArrayList<UserChoice> result = instance.getUserChoices();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setUserChoices method, of class PersonalityTestResult.
	 */
	@Test
	public void testSetUserChoices() {
		// TODO
		System.out.println("setUserChoices");
		ArrayList<UserChoice> userChoices = null;
		PersonalityTestResult instance = null;
		instance.setUserChoices(userChoices);
	}

	/**
	 * Test of getPersonalities method, of class PersonalityTestResult.
	 */
	@Test
	public void testGetPersonalities() {
		System.out.println("getPersonalities");
		PersonalityTestResult instance = new PersonalityTestResult(this.userChoices, this.personalities);
		ArrayList<Personality> expResult = this.personalities;
		ArrayList<Personality> result = instance.getPersonalities();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setPersonalities method, of class PersonalityTestResult.
	 */
	@Test
	public void testSetPersonalities() {
		System.out.println("setPersonalities");

		
		Personality personality = new Personality(1, "supercalifragilisticexpialidocious");
		
		ArrayList<Personality> personalities = new ArrayList<Personalities>();
		personalities.add(personality);

		PersonalityTestResult instance = new PersonalityTestResult(this.userChoices, this.personalities);
		instance.setPersonalities(personalities);
		result = instance.getPersonalities();
		assertEquals(personalities, result);
	}

	/**
	 * Test of compareChoices method, of class PersonalityTestResult.
	 */
	@Test
	public void testCompareChoices() {
		System.out.println("compareChoices");
		PersonalityTestResult instance = new PersonalityTestResult(this.userChoices, this.personalities);
		String expResult = "compareChoices result";
		String result = instance.compareChoices();
		assertEquals(expResult, result);
	}
}
