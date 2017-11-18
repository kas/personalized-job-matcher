/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import javafx.collections.*;

/**
 *
 * @author SHaynes
 */
public class PersonalityTraits2 {
    
    private ObservableList<String> personalityTraits;
    
    public PersonalityTraits2(){
        personalityTraits = setPersonalityTraits();
    }
    
    public ObservableList<String> getPersonalityTraits() {
        return personalityTraits;
    }
    
    public ObservableList<String> setPersonalityTraits(){
        ObservableList<String> traits = FXCollections.observableArrayList();
        
        String personalityTrait1 =  "independent";
        String personalityTrait2 =  "teamwork";
        String personalityTrait3 =  "";
        String personalityTrait4 =  "";
        
        traits.add(personalityTrait1);
        traits.add(personalityTrait2);
        traits.add(personalityTrait3);
        traits.add(personalityTrait4);
        
        
        return traits;
    }
    
}
