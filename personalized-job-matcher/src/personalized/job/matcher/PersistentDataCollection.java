/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.io.*;

/**
 *
 * @author austi
 */
public class PersistentDataCollection implements Serializable {

    private CareerProfileList theCareerProfileList;
    private JobSeekerList theJobSeekerList;
    //private PersonalityTestResultsList thePersonalityTestResultsList;
    private UserProfileList theUserProfileList;
    private EmployerList theEmployerList;
    private JobList theJobList;

    public PersistentDataCollection() {
        if (theCareerProfileList == null) {
            theCareerProfileList = new CareerProfileList();
        }
        if (theJobSeekerList == null) {
            theJobSeekerList = new JobSeekerList();
        }
        /*if (thePersonalityTestResultsList == null){
            thePersonalityTestResultsList = new PersonalityTestResultsList();
        }*/
        if (theUserProfileList == null) {
            theUserProfileList = new UserProfileList();
        }
        if (theEmployerList == null) {
            theEmployerList = new EmployerList();
        }
        if (theJobList == null) {
            theJobList = new JobList();
        }
    }

    /**
     * @return the theCareerProfileList
     */
    public CareerProfileList getTheCareerProfileList() {
        return theCareerProfileList;
    }

    /**
     * @return the theJobSeekerList
     */
    public JobSeekerList getTheJobSeekerList() {
        return theJobSeekerList;
    }

    /**
     * @return the theUserProfileList
     */
    public UserProfileList getTheUserProfileList() {
        return theUserProfileList;
    }

    /**
     * @return the theEmployerList
     */
    public EmployerList getTheEmployerList() {
        return theEmployerList;
    }

    /**
     * @return the theJobList
     */
    public JobList getTheJobList() {
        return theJobList;
    }
}
