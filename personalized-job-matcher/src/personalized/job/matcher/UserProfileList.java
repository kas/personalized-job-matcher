/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.util.ArrayList;

/**
 *
 * @author austi
 */
public class UserProfileList {

    private ArrayList<UserProfile> userProfileList;

    public UserProfileList() {
        userProfileList = new ArrayList<>();
        makeUserProfileList();
    }

    private void makeUserProfileList() {
        getUserProfileList().add(new UserProfile("Test", "user", "Jake", 21, "State Colelge", "Male", "Homeless"));
        getUserProfileList().add(new UserProfile("User", "test", "Jamie", 21, "State Colelge", "Female", "Professor"));
    }

    /**
     * @return the userProfileList
     */
    public ArrayList<UserProfile> getUserProfileList() {
        return userProfileList;
    }

    /**
     * @param userProfileList the userProfileList to set
     */
    public void setUserProfileList(ArrayList<UserProfile> userProfileList) {
        this.userProfileList = userProfileList;
    }
}
