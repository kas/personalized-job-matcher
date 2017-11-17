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
        
        personalityTraitList.add(personalityTrait1);
        personalityTraitList.add(personalityTrait2);
        personalityTraitList.add(personalityTrait3);
        personalityTraitList.add(personalityTrait4);
    }
}
