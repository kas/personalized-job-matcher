
package personalized.job.matcher;



/**
 *
 * @author Christian Kim
 */
public class JobSeeker extends User {
    private String username;
    //private String firstName;
    //private String lastName;
    private int profile;
    private String password;
    private String age;
    // private String city;
    //private String state;
    private String currentJob;
    private String sex;
    private String name;
    private String location;
    
    
    public JobSeeker(String newUsername, /*String newFirstName, String newLastName,*/
            String newName, int newProfile, String newPassword, String newAge, /*String newCity, 
            String newState,*/ String newLocation, String newSex, String newCurrentJob)
    {
        /*Code Commented Out Until we decide how specific to make some profile fields*/
	this.username = newUsername;
        //this.firstName = newFirstName;
        //this.lastName = newLastName; 
        this.profile = newProfile;
        this.password = newPassword;
        this.age = newAge;
        //this.city = newCity;
        //this.state = newState;
        this.currentJob = newCurrentJob;
        this.sex = newSex;
        this.name = newName;
        this.location = newLocation;
        
        
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

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the currentJob
     */
    public String getCurrentJob() {
        return currentJob;
    }

    /**
     * @param currentJob the currentJob to set
     */
    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
}
