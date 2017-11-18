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
         String personalityTrait1 =  "Introverted";
         String personalityTrait2 =  "Extroverted";
         String personalityTrait3 =  "Organized";
         String personalityTrait4 =  "Competitive";
         String personalityTrait5 =  "Selfless";
         String personalityTrait6 =  "Creative";
         String personalityTrait7 =  "Confident";
         String personalityTrait8 =  "Adaptable";
         String personalityTrait9 =  "Energetic";
         String personalityTrait10 =  "Sympathetic";
        
        getPersonalityTraitList().add(personalityTrait1);
        getPersonalityTraitList().add(personalityTrait2);
        getPersonalityTraitList().add(personalityTrait3);
        getPersonalityTraitList().add(personalityTrait4);
        getPersonalityTraitList().add(personalityTrait5);
        getPersonalityTraitList().add(personalityTrait6);
        getPersonalityTraitList().add(personalityTrait7);
        getPersonalityTraitList().add(personalityTrait8);
        getPersonalityTraitList().add(personalityTrait9);
        getPersonalityTraitList().add(personalityTrait10);
        
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
