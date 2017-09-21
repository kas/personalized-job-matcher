/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized_job_matcher;

/**
 *
 * @author kas
 */
public class TestHarness {
	public TestHarness() {
		// User tests
		System.out.println("User class");
		User testUser = new User("username", "password");
		if (testUser != null) {
			System.out.println("User constructor works!");
		} else {
			System.out.println("User constructor failed!");
		}

		String testUsername = testUser.getUsername();
		if (testUsername.equals("username")) {
			System.out.println("Test User username accessor works!");
		} else {
			System.out.println("Test User username accessor failed!");
		}

		// Personality tests
		System.out.println("Personality class");
		Personality testPersonality = new Personality(0, "personalityType");
		if (testPersonality != null) {
			System.out.println("Personality constructor works!");
		} else {
			System.out.println("Personality constructor failed!");
		}

		int testPersonalityId = testPersonality.getPersonalityId();
		if (testPersonalityId == 0) {
			System.out.println("Test Personality personalityId accessor works!");
		} else {
			System.out.println("Test Personality personalityId accessor failed!");
		}

		String testPersonalityType = testPersonality.getPersonalityType();
		if (testPersonalityType.equals("personalityType")) {
			System.out.println("Test Personality personalityType accessor works!");
		} else {
			System.out.println("Test Personality personalityType accessor failed!");
		}

		// Profile tests
		System.out.println("Profile class");
		Profile testProfile = new Profile(testPersonality, 21);
		if (testProfile != null) {
			System.out.println("Profile constructor works!");
		} else {
			System.out.println("Profile constructor failed!");
		}

		Personality testProfilePersonality = testProfile.getPersonality();
		if (testProfilePersonality != null) {
			System.out.println("Test Profile personality accessor works!");
		} else {
			System.out.println("Test Profile personality accessor failed!");
		}

		int testProfileAge = testProfile.getAge();
		if (testProfileAge == 21) {
			System.out.println("Test Profile age accessor works!");
		} else {
			System.out.println("Test Profile age accessor failed!");
		}
	}
}

