/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.util.ArrayList;

/**
 *
 * @author KAS6570
 */
public class Employer {
    private String name;
    private String username;
    private String password;
    private ArrayList<Job> jobs = new ArrayList<Job>();
    private ArrayList<CareerProfile> careerProfileList;
    
    public Employer(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    public void addJobs(){
        Job testjob1 = new Job("Test", "Tests the testing test", careerProfileList.get(0));
        Job testjob2 = new Job("Test", "Tests the testing test", careerProfileList.get(0));
        Job testjob3 = new Job("Test", "Tests the testing test", careerProfileList.get(0));
        Job testjob4 = new Job("Test", "Tests the testing test", careerProfileList.get(0));
        Job testjob5 = new Job("Test1", "Tests the testing test", careerProfileList.get(1));
        Job testjob6 = new Job("Test1", "Tests the testing test", careerProfileList.get(1));
        Job testjob7 = new Job("Test1", "Tests the testing test", careerProfileList.get(1));
        Job testjob8 = new Job("Test1", "Tests the testing test", careerProfileList.get(1));
        Job testjob9 = new Job("Test1", "Tests the testing test", careerProfileList.get(1));
        
        jobs.add(testjob1);
        jobs.add(testjob2);
        jobs.add(testjob3);
        jobs.add(testjob4);
        jobs.add(testjob5);
        jobs.add(testjob6);
        jobs.add(testjob7);
        jobs.add(testjob8);
        jobs.add(testjob9);
        
        
    }
    
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the jobs
     */
    public ArrayList<Job> getJobs() {
        return jobs;
    }

    /**
     * @param jobs the jobs to set
     */
    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
}
