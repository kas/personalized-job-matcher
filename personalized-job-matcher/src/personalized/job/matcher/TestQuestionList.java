
package personalized.job.matcher;

import java.util.ArrayList;


public class TestQuestionList {
    ArrayList<TestQuestion> testQuestions;
    
    public TestQuestionList(){
        testQuestions = new ArrayList<>();
        createQuestions();
        
    }

    

    private void createQuestions() {
        TestQuestion question1 = new TestQuestion("Do you enjoy working in teams?");
        TestQuestion question2 = new TestQuestion("Do you enjoy working in teams?");
        TestQuestion question3 = new TestQuestion("Do you enjoy working in teams?");
        TestQuestion question4 = new TestQuestion("Do you enjoy working in teams?");
        TestQuestion question5 = new TestQuestion("Do you enjoy working in teams?");
        TestQuestion question6 = new TestQuestion("Do you enjoy working in teams?");
        TestQuestion question7 = new TestQuestion("Do you enjoy working in teams?");
        TestQuestion question8 = new TestQuestion("Do you enjoy working in teams?");
        TestQuestion question9 = new TestQuestion("Do you enjoy working in teams?");
        TestQuestion question10 = new TestQuestion("Do you enjoy working in teams?");
        
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
