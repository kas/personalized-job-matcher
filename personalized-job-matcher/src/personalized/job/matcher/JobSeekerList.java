package personalized.job.matcher;


import java.util.ArrayList;


public class JobSeekerList {
    
    private ArrayList<JobSeeker> userList;
    
    public JobSeekerList(){
        userList = new ArrayList<>();
        makeUserList();
    }

    private void makeUserList() {
        JobSeeker user1 = new JobSeeker ("testuser1","TestUser", 1, "password", "28", "State College PA", "Male", "Student");
        JobSeeker user2 = new JobSeeker ("testuser1","TestUser", 2, "password", "28", "State College PA", "Male", "Student");
        JobSeeker user3 = new JobSeeker ("testuser1","TestUser", 3, "password", "28", "State College PA", "Male", "Student");
        JobSeeker user4 = new JobSeeker ("testuser1","TestUser", 4, "password", "28", "State College PA", "Male", "Student");
        JobSeeker user5 = new JobSeeker ("testuser1","TestUser", 5, "password", "28", "State College PA", "Male", "Student");
        JobSeeker user6 = new JobSeeker ("testuser1","TestUser", 6, "password", "28", "State College PA", "Male", "Student");
        
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
    }

    /**
     * @return the userList
     */
    public ArrayList<JobSeeker> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(ArrayList<JobSeeker> userList) {
        this.userList = userList;
    }
    
    public int getSize()
    {
        return this.userList.size();
    }
}
