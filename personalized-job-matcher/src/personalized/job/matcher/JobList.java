/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author austi
 */
public class JobList {
    
    private ArrayList<Job> JobList;
    
    public JobList() {
        JobList = new ArrayList<>();
        makeJobList();
    }
    
    private void makeJobList(){
    }

    /**
     * @return the JobList
     */
    public ArrayList<Job> getJobList() {
        return JobList;
    }

    /**
     * @param JobList the JobList to set
     */
    public void setJobList(ArrayList<Job> JobList) {
        this.JobList = JobList;
    }
    
    
}
