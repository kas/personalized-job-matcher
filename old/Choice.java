
package personalized.job.matcher;




public class Choice {
        
        private int choiceID = 0;
        private String choiceText = "";
                
    
	public Choice(int newChoiceID, String newChoiceText){
            this.choiceID = newChoiceID;
            this.choiceText = newChoiceText;
            
        }

 
    public int getChoiceID() {
        return choiceID;
    }

   
    public void setChoiceID(int choiceID) {
        this.choiceID = choiceID;
    }

    
    public String getChoiceText() {
        return choiceText;
    }

    
    public void setChoiceText(String choiceText) {
        this.choiceText = choiceText;
    }
}
