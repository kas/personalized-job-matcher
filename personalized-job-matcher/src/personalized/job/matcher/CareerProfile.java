/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.util.List;

/**
 *
 * @author KAS6570
 */
public class CareerProfile {

    private String name;
    private String medianSalary;
    private String description;
    private List<String> personalityTraits;

    public CareerProfile(String name, String medianSalary, String description, List<String> personalityTraits) {
        this.name = name;
        this.medianSalary = medianSalary;
        this.description = description;
        this.personalityTraits = personalityTraits;
    }

    public String toString() {
        return this.name;
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
     * @return the medianSalary
     */
    public String getMedianSalary() {
        return medianSalary;
    }

    /**
     * @param medianSalary the medianSalary to set
     */
    public void setMedianSalary(String medianSalary) {
        this.medianSalary = medianSalary;
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
     * @return the personalityTraits
     */
    public List<String> getPersonalityTraits() {
        return personalityTraits;
    }

    /**
     * @param personalityTraits the personalityTraits to set
     */
    public void setPersonalityTraits(List<String> personalityTraits) {
        this.personalityTraits = personalityTraits;
    }
}
