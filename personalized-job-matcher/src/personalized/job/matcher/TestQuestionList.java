
package personalized.job.matcher;

import java.util.ArrayList;


public class TestQuestionList {
    ArrayList<TestQuestion> testQuestions;
    
    public TestQuestionList(){
        testQuestions = new ArrayList<>();
        createQuestions();
        
    }

    

    private void createQuestions() {
        TestQuestion question1 = new TestQuestion("You enjoy working in teams.");
        TestQuestion question2 = new TestQuestion("You find it difficult to speak loudly.");
        TestQuestion question3 = new TestQuestion("You tend to sympathize with other people.");
        TestQuestion question4 = new TestQuestion("Do you value justice over mercy?");
        TestQuestion question5 = new TestQuestion("You take pleasure in putting things in order.");
        TestQuestion question6 = new TestQuestion("You easily understand new theoretical principles");
        TestQuestion question7 = new TestQuestion("The more people you speak to, the better you feel");
        TestQuestion question8 = new TestQuestion("As a rule, you proceed only when you have a clear and detailed plan");
        TestQuestion question9 = new TestQuestion("Often you prefer to read a book than go to a party");
        TestQuestion question10 = new TestQuestion("You are more inclined to experiment than to follow familiar approaches");
        
        testQuestions.add(question1);
        testQuestions.add(question2);
        testQuestions.add(question3);
        testQuestions.add(question4);
        testQuestions.add(question5);
        testQuestions.add(question6);
        testQuestions.add(question7);
        testQuestions.add(question8);
        testQuestions.add(question9);
        testQuestions.add(question10);
      
        
    }
    
}
