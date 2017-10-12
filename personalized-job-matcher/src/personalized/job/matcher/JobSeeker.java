
package personalized.job.matcher;

/**
 *
 * @author Christian Kim
 */
public class JobSeeker extends User {
    private String firstName;
    private String lastName;
    private int profile;
    String password;
    
    public JobSeeker(String newFirstName, String newLastName, int newProfile, String newPassword)
    {
        firstName = newFirstName;
        lastName = newLastName;
        profile = newProfile;
        password = newPassword;
        
        
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the profile
     */
    public int getProfile() {
        return profile;
    }

    /**
     * @param profile the profile to set
     */
    public void setProfile(int profile) {
        this.profile = profile;
    }

    @Override
    public boolean signIn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
