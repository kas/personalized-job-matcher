/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

/**
 *
 * @author ckk5093
 */
public class Job {
    private int jobID = 0;
    private String jobType = " ";
    private int employerID = 0;
    
    public Job (int newJobID, String newJobType, int newEmployerID)
    {
        this.jobID = newJobID;
        this.jobType = newJobType;
        this.employerID = newEmployerID;
    }

    /**
     * @return the jobID
     */
    public int getJobID() {
        return jobID;
    }

    /**
     * @param jobID the jobID to set
     */
    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    /**
     * @return the jobType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * @param jobType the jobType to set
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * @return the employer
     */
    public int getEmployer() {
        return employerID;
    }

    /**
     * @param employer the employer to set
     */
    public void setEmployer(int employer) {
        this.employerID = employer;
    }
}
