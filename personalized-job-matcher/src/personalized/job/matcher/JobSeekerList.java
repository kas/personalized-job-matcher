package personalized.job.matcher;

import java.util.ArrayList;


public class JobSeekerList {
    
    ArrayList<JobSeeker> userList;
    
    public JobSeekerList(){
        userList = new ArrayList<>();
        makeUserList();
    }

    private void makeUserList() {
        JobSeeker testUser1 = new JobSeeker ("testuser1","Test", "User", 1, "password");
        JobSeeker testUser2 = new JobSeeker ("testuser2","Test", "User", 2, "password");
        JobSeeker testUser3 = new JobSeeker ("testuser3","Test", "User", 3, "password");
        JobSeeker testUser4 = new JobSeeker ("testuser4","Test", "User", 4, "password");
        JobSeeker testUser5 = new JobSeeker ("testuser5","Test", "User", 5, "password");
        JobSeeker testUser6 = new JobSeeker ("testuser6","Test", "User", 6, "password");
        
        userList.add(testUser1);
        userList.add(testUser2);
        userList.add(testUser3);
        userList.add(testUser4);
        userList.add(testUser5);
        userList.add(testUser6);
    }
}