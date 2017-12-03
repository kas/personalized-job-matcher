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
public class PersistentDataCollection implements Serializable{
    
    private CareerProfileList theCareerProfileList;
    private JobSeekerList theJobSeekerList;
    //private PersonalityTestResultsList thePersonalityTestResultsList;
    private UserProfileList theUserProfileList;
    private EmployerList theEmployerList;
    private JobList theJobList;
    
    public PersistentDataCollection() {
        if (theCareerProfileList == null){
            theCareerProfileList = new CareerProfileList
        }  
        if (theJobSeekerList == null){
            theJobSeekerList = new JobSeekerList
        }  
        /*if (thePersonalityTestResultsList == null){
            thePersonalityTestResultsList = new PersonalityTestResultsList
        }*/  
        if (theProfileList == null){
            theProfileList = new ProfileList
        }  
        if (theEmployerList == null){
            theEmployerList = new EmployerList
        }  
        if (theJobList == null){
            theJobList = new JobList
        }  
    }   
}
