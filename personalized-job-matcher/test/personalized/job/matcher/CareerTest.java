

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

public class CareerTest {
    
	private ArrayList<Personality> personalities;
	private Profile profile;
	
	public CareerTest() {
		Personality personality = new Personality(0, "rambunctious");

		this.personalities = new ArrayList<Personality>();
		this.personalities.add(personality);

		this.profile = new Profile(0, personality, 25);
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
	 * Test of getTitle method, of class Career.
	 */
	@Test
	public void testGetTitle() {
		System.out.println("getTitle");
		Career instance = new Career("assistant regional manager", this.personalities, this.profile);
		String expResult = "assistant regional manager";
		String result = instance.getTitle();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setTitle method, of class Career.
	 */
	@Test
	public void testSetTitle() {
		System.out.println("setTitle");
		String title = "assistant TO THE regional manager";
		Career instance = new Career("assistant regional manager", this.personalities, this.profile);
		instance.setTitle(title);
		String result = instance.getTitle();
		assertEquals(title, result);
	}

	/**
	 * Test of getPersonalities method, of class Career.
	 */
	@Test
	public void testGetPersonalities() {
		System.out.println("getPersonalities");
		Career instance = new Career("assistant regional manager", this.personalities, this.profile);
		ArrayList<Personality> expResult = this.personalities;
		ArrayList<Personality> result = instance.getPersonalities();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setPersonalities method, of class Career.
	 */
	@Test
	public void testSetPersonalities() {
		System.out.println("setPersonalities");

		Personality newPersonality = new Personality(1, "supercalifragilisticexpialidocious");

		ArrayList<Personality> newPersonalities = this.personalities;
		newPersonalities.add(newPersonality);

		Career instance = new Career("assistant regional manager", this.personalities, this.profile);
		instance.setPersonalities(newPersonalities);
		ArrayList<Personality> result = instance.getPersonalities();
		assertEquals(newPersonalities, result);
	}

	/**
	 * Test of getProfile method, of class Career.
	 */
	@Test
	public void testGetProfile() {
		System.out.println("getProfile");
		Career instance = new Career("assistant regional manager", this.personalities, this.profile);
		Profile expResult = this.profile;
		Profile result = instance.getProfile();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setProfile method, of class Career.
	 */
	@Test
	public void testSetProfile() {
		System.out.println("setProfile");

		Personality newPersonality = new Personality(1, "supercalifragilisticexpialidocious");

		Profile newProfile = new Profile(1, newPersonality, 12);

		Career instance = new Career("assistant regional manager", this.personalities, this.profile);
		instance.setProfile(newProfile);
		Profile result = instance.getProfile();
		assertEquals(newProfile, result);
	}
        
}

