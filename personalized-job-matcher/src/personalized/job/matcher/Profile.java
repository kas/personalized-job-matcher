/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

/**
 *
 * @author kas
 */
public class Profile {

	/**
	 * @return the personality
	 */
	public Personality getPersonality() {
		return personality;
	}

	/**
	 * @param personality the personality to set
	 */
	public void setPersonality(Personality personality) {
		this.personality = personality;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	private Personality personality;
	private int age;

	public Profile(Personality personality, int age) {
		this.personality = personality;
		this.age = age;
	}
}
