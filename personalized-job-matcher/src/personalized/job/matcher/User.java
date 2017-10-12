/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalized.job.matcher;

import java.util.Date;

public abstract class User {
    private Date dateCreated;
    private Date dateUpdated;
    
    public abstract boolean signIn();
}
