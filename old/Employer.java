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
public class Employer extends User implements Savable {
    private String name;
    private ArrayList<Job> jobsList;

    public Employer(String name, ArrayList<Job> jobsList) {
        this.name = name;
        this.jobsList = jobsList;
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
     * @return the jobsList
     */
    public ArrayList<Job> getJobsList() {
        return jobsList;
    }

    /**
     * @param jobsList the jobsList to set
     */
    public void setJobsList(ArrayList<Job> jobsList) {
        this.jobsList = jobsList;
    }

  @Override
  public boolean signIn() {
    return false;
  }

  @Override
  public boolean save() {
    return false;
  }
}
