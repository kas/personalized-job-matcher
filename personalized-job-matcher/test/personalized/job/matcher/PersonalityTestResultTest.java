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
	private ArrayList<Choice> choices;
	private ArrayList<Personality> personalities;

	public PersonalityTestResultTest() {
		Choice choice = new Choice(0, "a");

		ArrayList<Choice> choices = new ArrayList<Choice>();
		choices.add(choice);

		this.choices = choices;

		Personality personality = new Personality(0, "rambunctious");
		
		ArrayList<Personality> personalities = new ArrayList<Personality>();
		personalities.add(personality);

		this.personalities = personalities;
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
	 * Test of getChoices method, of class PersonalityTestResult.
	 */
	@Test
	public void testGetChoices() {
		System.out.println("getChoices");
		PersonalityTestResult instance = new PersonalityTestResult(this.choices, this.personalities);
		ArrayList<Choice> expResult = this.choices;
		ArrayList<Choice> result = instance.getChoices();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setChoices method, of class PersonalityTestResult.
	 */
	@Test
	public void testSetChoices() {
		System.out.println("setChoices");
		ArrayList<Choice> choices = new ArrayList<Choice>();
		Choice choice = new Choice(1, "b");
		choices.add(choice);
		PersonalityTestResult instance = new PersonalityTestResult(this.choices, this.personalities);
		instance.setChoices(choices);
		ArrayList<Choice> result = instance.getChoices();
		assertEquals(choices, result);
	}

	/**
	 * Test of getPersonalities method, of class PersonalityTestResult.
	 */
	@Test
	public void testGetPersonalities() {
		System.out.println("getPersonalities");
		PersonalityTestResult instance = new PersonalityTestResult(this.choices, this.personalities);
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
		
		ArrayList<Personality> personalities = new ArrayList<Personality>();
		personalities.add(personality);

		PersonalityTestResult instance = new PersonalityTestResult(this.choices, this.personalities);
		instance.setPersonalities(personalities);
		ArrayList<Personality> result = instance.getPersonalities();
		assertEquals(personalities, result);
	}

	/**
	 * Test of compareChoices method, of class PersonalityTestResult.
	 */
	@Test
	public void testCompareChoices() {
		System.out.println("compareChoices");
		PersonalityTestResult instance = new PersonalityTestResult(this.choices, this.personalities);
		String expResult = "compareChoices result";
		String result = instance.compareChoices();
		assertEquals(expResult, result);
	}
}
