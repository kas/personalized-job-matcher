package personalized.job.matcher;


import java.util.ArrayList;


public class JobSeekerList {
    
    private ArrayList<JobSeeker> userList;
    
    public JobSeekerList(){
        userList = new ArrayList<>();
        makeUserList();
    }

    private void makeUserList() {
        JobSeeker user1 = new JobSeeker ("testuser1","Test", "User", 1, "password", "28", "State College", "PA", "Student", "Male");
        JobSeeker user2 = new JobSeeker ("testuser2","Test", "User", 2, "password", "28", "State College", "PA", "Student", "Male");
        JobSeeker user3 = new JobSeeker ("testuser3","Test", "User", 3, "password", "28", "State College", "PA", "Student", "Male");
        JobSeeker user4 = new JobSeeker ("testuser4","Test", "User", 4, "password", "28", "State College", "PA", "Student", "Male");
        JobSeeker user5 = new JobSeeker ("testuser5","Test", "User", 5, "password", "28", "State College", "PA", "Student", "Male");
        JobSeeker user6 = new JobSeeker ("testuser6","Test", "User", 6, "password", "28", "State College", "PA", "Student", "Male");
        
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
    
    
}
