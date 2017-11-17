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
public class PersonalityTrait {
    private String personalityTrait;
    
    public PersonalityTrait(String personalityTrait) {
        this.personalityTrait = personalityTrait;
    }

    /**
     * @return the personalityTrait
     */
    public String getPersonalityTrait() {
        return personalityTrait;
    }

    /**
     * @param personalityTrait the personalityTrait to set
     */
    public void setPersonalityTrait(String personalityTrait) {
        this.personalityTrait = personalityTrait;
    }
}
