package personalized.job.matcher;

import java.util.ArrayList;

public class JobSeekerList {

    private ArrayList<JobSeeker> jobSeekerList;

    public JobSeekerList() {
        jobSeekerList = new ArrayList<>();
        makeJobSeekerList();
    }

    private void makeJobSeekerList() {
        JobSeeker jobSeeker1 = new JobSeeker("testuser1", "TestUser", 1, "password", "28", "State College PA", "Male", "Student");
        JobSeeker jobSeeker2 = new JobSeeker("testuser1", "TestUser", 2, "password", "28", "State College PA", "Male", "Student");
        JobSeeker jobSeeker3 = new JobSeeker("testuser1", "TestUser", 3, "password", "28", "State College PA", "Male", "Student");
        JobSeeker jobSeeker4 = new JobSeeker("testuser1", "TestUser", 4, "password", "28", "State College PA", "Male", "Student");
        JobSeeker jobSeeker5 = new JobSeeker("testuser1", "TestUser", 5, "password", "28", "State College PA", "Male", "Student");
        JobSeeker jobSeeker6 = new JobSeeker("testuser1", "TestUser", 6, "password", "28", "State College PA", "Male", "Student");

        jobSeekerList.add(jobSeeker1);
        jobSeekerList.add(jobSeeker2);
        jobSeekerList.add(jobSeeker3);
        jobSeekerList.add(jobSeeker4);
        jobSeekerList.add(jobSeeker5);
        jobSeekerList.add(jobSeeker6);
    }

    /**
     * @return the jobSeekerList
     */
    public ArrayList<JobSeeker> getJobSeekerList() {
        return jobSeekerList;
    }

    /**
     * @param jobSeekerList the jobSeekerList to set
     */
    public void setUserList(ArrayList<JobSeeker> jobSeekerList) {
        this.jobSeekerList = jobSeekerList;
    }

    public int getSize() {
        return this.jobSeekerList.size();
    }
}
