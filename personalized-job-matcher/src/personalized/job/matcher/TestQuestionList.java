package personalized.job.matcher;

import java.util.ArrayList;

public class TestQuestionList {

    private ArrayList<TestQuestion> testQuestions;

    public TestQuestionList() {
        testQuestions = new ArrayList<>();
        createQuestions();

    }

    private void createQuestions() {
        TestQuestion question1 = new TestQuestion("You enjoy designing and creating new things.", "Creative");
        TestQuestion question2 = new TestQuestion("You find it difficult to speak loudly.", "Introverted");
        TestQuestion question3 = new TestQuestion("You tend to sympathize with other people.", "Sympathetic");
        TestQuestion question4 = new TestQuestion("You find winning more important, than having fun", "Competitive");
        TestQuestion question5 = new TestQuestion("You take pleasure in putting things in order.", "Organized");
        TestQuestion question6 = new TestQuestion("You overcome obstacles easily.", "Adaptable");
        TestQuestion question7 = new TestQuestion("The more people you speak to, the better you feel", "Extroverted");
        TestQuestion question8 = new TestQuestion("The more stuff you have to do, the better.", "Energetic");
        TestQuestion question9 = new TestQuestion("You can easily introduce yourself or give a speech.", "Confident");
        TestQuestion question10 = new TestQuestion("You often help others, even if it might inconvenience you.", "Selfless");

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

    /**
     * @return the testQuestions
     */
    public ArrayList<TestQuestion> getTestQuestions() {
        return testQuestions;
    }

    /**
     * @param testQuestions the testQuestions to set
     */
    public void setTestQuestions(ArrayList<TestQuestion> testQuestions) {
        this.testQuestions = testQuestions;
    }

}
