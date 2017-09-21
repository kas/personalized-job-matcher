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
public class Personality {

	/**
	 * @return the personalityId
	 */
	public int getPersonalityId() {
		return personalityId;
	}

	/**
	 * @param personalityId the personalityId to set
	 */
	public void setPersonalityId(int personalityId) {
		this.personalityId = personalityId;
	}

	/**
	 * @return the personalityType
	 */
	public String getPersonalityType() {
		return personalityType;
	}

	/**
	 * @param personalityType the personalityType to set
	 */
	public void setPersonalityType(String personalityType) {
		this.personalityType = personalityType;
	}
	private int personalityId;
	private String personalityType;

	public Personality(int personalityId, String personalityType) {
		this.personalityId = personalityId;
		this.personalityType = personalityType;
	}
}
