
package personalized.job.matcher;

public class Profile {
        private Personality personality;
	private int age;
	private int id;

	public Profile(int id, Personality personality, int age) 
        {
		this.id = id;
		this.personality = personality;
		this.age = age;
	}
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
	
}
