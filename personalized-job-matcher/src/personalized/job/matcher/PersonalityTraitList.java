/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.util.ArrayList;

/**
 *
 * @author KAS6570
 */
public class PersonalityTraitList {
    private ArrayList<PersonalityTrait> personalityTraitList;
     
   public PersonalityTraitList(){
        personalityTraitList = new ArrayList<>();
        makePersonalityTraitList();
    }
    
    private void makePersonalityTraitList() {
        PersonalityTrait personalityTrait1 = new PersonalityTrait ("independent");
        PersonalityTrait personalityTrait2 = new PersonalityTrait ("teamwork");
        PersonalityTrait personalityTrait3 = new PersonalityTrait ("");
        PersonalityTrait personalityTrait4 = new PersonalityTrait ("");
        
        getPersonalityTraitList().add(personalityTrait1);
        getPersonalityTraitList().add(personalityTrait2);
        getPersonalityTraitList().add(personalityTrait3);
        getPersonalityTraitList().add(personalityTrait4);
    }

    /**
     * @return the personalityTraitList
     */
    public ArrayList<PersonalityTrait> getPersonalityTraitList() {
        return personalityTraitList;
    }

    /**
     * @param personalityTraitList the personalityTraitList to set
     */
    public void setPersonalityTraitList(ArrayList<PersonalityTrait> personalityTraitList) {
        this.personalityTraitList = personalityTraitList;
    }
}
