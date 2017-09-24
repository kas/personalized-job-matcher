/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.util.ArrayList;

/**
 *
 * @author austi
 */
public class Posting {
    private String title;
    private ArrayList<Personality> personalityTypesList;
    private String description;
    
    public Posting (String title, ArrayList<Personality> personalityTypesList, String description)
    {
        this.title = title;
        this.personalityTypesList = personalityTypesList;
        this.description = description;
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
     * @return the personalityTypesList
     */
    public ArrayList<Personality> getPersonalityTypesList() {
        return personalityTypesList;
    }

    /**
     * @param personalityTypesList the personalityTypesList to set
     */
    public void setPersonalityTypesList(ArrayList<Personality> personalityTypesList) {
        this.personalityTypesList = personalityTypesList;
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
            
    
}
