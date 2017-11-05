
package personalized.job.matcher;



/**
 *
 * @author Christian Kim
 */
public class JobSeeker extends User {
    private String username;
    private String firstName;
    private String lastName;
    private int profile;
    private String password;
    private String age;
    private String city;
    private String state;
    private String currentJob;
    private String sex;
    
    
    public JobSeeker(String newUsername, String newFirstName, String newLastName, int newProfile, String newPassword, String newAge, String newCity, String newState, String newCurrentJob, String newSex)
    {
	this.username = newUsername;
        this.firstName = newFirstName;
        this.lastName = newLastName; 
        this.profile = newProfile;
        this.password = newPassword;
        this.age = newAge;
        this.city = newCity;
        this.state = newState;
        this.currentJob = newCurrentJob;
        this.sex = newSex;
        
        
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
    
    public String getLocation(){
        String location = this.city + ", " + this.state;       
        return location;
    }
    
    public String getFullName(){
        String name = this.firstName + " " + this.lastName;
        return name;
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
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
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
}
