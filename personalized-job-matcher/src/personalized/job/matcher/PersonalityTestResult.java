/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.util.ArrayList;

/**
 *
 * @author kas
 */
public class PersonalityTestResult {

	/**
	 * @return the userChoices
	 */
	public ArrayList<UserChoice> getUserChoices() {
		return userChoices;
	}

	/**
	 * @param userChoices the userChoices to set
	 */
	public void setUserChoices(ArrayList<UserChoice> userChoices) {
		this.userChoices = userChoices;
	}

	/**
	 * @return the personalities
	 */
	public ArrayList<Personality> getPersonalities() {
		return personalities;
	}

	/**
	 * @param personalities the personalities to set
	 */
	public void setPersonalities(ArrayList<Personality> personalities) {
		this.personalities = personalities;
	}
	private ArrayList<UserChoice> userChoices;
	private ArrayList<Personality> personalities;

	public PersonalityTestResult(ArrayList<UserChoice> userChoices, ArrayList<Personality> personalities) {
		this.userChoices = userChoices;
		this.personalities = personalities;
	}

	public String compareChoices() {
		// TODO

		// return this.userChoices[0];
		return "compareChoices result";
	}
}
