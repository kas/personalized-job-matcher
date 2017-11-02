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
	private ArrayList<Choice> choices;
	private ArrayList<Personality> personalities;

	public PersonalityTestResult(ArrayList<Choice> choices, ArrayList<Personality> personalities) {
		this.choices = choices;
		this.personalities = personalities;
	}

	public String compareChoices() {
		// TODO

		// return this.choices[0];
		return "compareChoices result";
	}

	/**
	 * @return the choices
	 */
	public ArrayList<Choice> getChoices() {
		return this.choices;
	}

	/**
	 * @param choices the choices to set
	 */
	public void setChoices(ArrayList<Choice> choices) {
		this.choices = choices;
	}

	/**
	 * @return the personalities
	 */
	public ArrayList<Personality> getPersonalities() {
		return this.personalities;
	}

	/**
	 * @param personalities the personalities to set
	 */
	public void setPersonalities(ArrayList<Personality> personalities) {
		this.personalities = personalities;
	}
}
