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
    private ArrayList<String> personalityTraitList;
     
   public PersonalityTraitList(){
        personalityTraitList = new ArrayList<>();
        makePersonalityTraitList();
    }
    
    private void makePersonalityTraitList() {
         String personalityTrait1 =  "independent";
         String personalityTrait2 =  "teamwork";
         String personalityTrait3 =  "";
         String personalityTrait4 =  "";
        
        getPersonalityTraitList().add(personalityTrait1);
        getPersonalityTraitList().add(personalityTrait2);
        getPersonalityTraitList().add(personalityTrait3);
        getPersonalityTraitList().add(personalityTrait4);
    }

    /**
     * @return the personalityTraitList
     */
    public ArrayList<String> getPersonalityTraitList() {
        return personalityTraitList;
    }

    /**
     * @param personalityTraitList the personalityTraitList to set
     */
    public void setPersonalityTraitList(ArrayList<String> personalityTraitList) {
        this.personalityTraitList = personalityTraitList;
    }
}
