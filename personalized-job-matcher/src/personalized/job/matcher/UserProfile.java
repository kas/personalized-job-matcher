/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

/**
 *
 * @author austi
 */

import java.util.*;

public class UserProfile {
    private String username;
    private String password;
    private String name;
    private int age;
    private String location;
    private String sex;
    private String currentJob;
    
    ArrayList<UserProfile> userProfileList = new ArrayList<UserProfile>();
    
    public UserProfile(String username, String password, String name, int age, String location, String sex, String currentJob)
    {
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.location = location;
        this.sex = sex;
        this.currentJob = currentJob;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the currentJob
     */
    public String getCurrentJob() {
        return currentJob;
    }

    /**
     * @param currentJob the currentJob to set
     */
    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }
}
