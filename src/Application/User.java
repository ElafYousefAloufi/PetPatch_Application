
package Application;

import cpit380practice.Picture;

public class User {
    
    String username;
    String email;
    String phoneNum;
    String pass;
    Picture profilePic;

    public User(String username, String email, String phoneNum, String pass, Picture profilePic) {
        this.username = username;
        this.email = email;
        this.phoneNum = phoneNum;
        this.pass = pass;
        this.profilePic = profilePic;
    }

    public User() {
    }

    public Picture getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Picture profilePic) {
        this.profilePic = profilePic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
