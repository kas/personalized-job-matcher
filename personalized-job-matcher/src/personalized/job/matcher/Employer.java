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
    private ArrayList<Job> jobs = new ArrayList<>();
    private ArrayList<CareerProfile> careerProfileList = new ArrayList<>();

    public Employer(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;

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

    /**
     * @return the careerProfileList
     */
    public ArrayList<CareerProfile> getCareerProfileList() {
        return careerProfileList;
    }

    /**
     * @param careerProfileList the careerProfileList to set
     */
    public void setCareerProfileList(ArrayList<CareerProfile> careerProfileList) {
        this.careerProfileList = careerProfileList;
    }
}
