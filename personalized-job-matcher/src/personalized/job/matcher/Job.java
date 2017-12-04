/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

/**
 *
 * @author KAS6570
 */
public class Job {
    private String title;
    private String description;
    private CareerProfile careerProfile;
    
    public Job(String title, String description, CareerProfile careerProfile) {
        this.title = title;
        this.description = description;
        this.careerProfile = careerProfile;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the careerProfile
     */
    public CareerProfile getCareerProfile() {
        return careerProfile;
    }

    /**
     * @param careerProfile the careerProfile to set
     */
    public void setCareerProfile(CareerProfile careerProfile) {
        this.careerProfile = careerProfile;
    }
}
