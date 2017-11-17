
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
        TestQuestion question2 = new TestQuestion("question2");
        TestQuestion question3 = new TestQuestion("question3");
        TestQuestion question4 = new TestQuestion("question4");
        TestQuestion question5 = new TestQuestion("question5");
        TestQuestion question6 = new TestQuestion("question6");
        TestQuestion question7 = new TestQuestion("question7");
        TestQuestion question8 = new TestQuestion("question8");
        TestQuestion question9 = new TestQuestion("question9");
        TestQuestion question10 = new TestQuestion("question10");
        
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
