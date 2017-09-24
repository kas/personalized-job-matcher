/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.util.Date;

/**
 *
 * @author austi
 */
public class UserPersonalityTest {
    private int testID;
    private int userID;
    private Date dateTaken;
    
    public UserPersonalityTest (int testID, int userID, Date dateTaken)
    {
        this.testID = testID;
        this.userID = userID;
        this.dateTaken = dateTaken;
    }

    /**
     * @return the testID
     */
    public int getTestID() {
        return testID;
    }

    /**
     * @param testID the testID to set
     */
    public void setTestID(int testID) {
        this.testID = testID;
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * @return the dateTaken
     */
    public Date getDateTaken() {
        return dateTaken;
    }

    /**
     * @param dateTaken the dateTaken to set
     */
    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }
}
