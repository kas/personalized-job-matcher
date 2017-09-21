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
public class Career {
	private String title;
	private ArrayList<Personality> personalities;
	private Profile profile;

	public Career(String title, ArrayList<Personality> personalities, Profile profile) {
		this.title = title;
		this.personalities = personalities;
		this.profile = profile;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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

	/**
	 * @return the profile
	 */
	public Profile getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
}

