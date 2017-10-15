package com.example.aishanyasingh.steller;

/**
 * Created by Aishanya Singh on 10/15/2017.
 */

public class UserObject {
    String email;
    String uid;
    String name;
    String bio;
    String penname;


    UserObject(){}
    public String getPenname() {
        return penname;
    }

    public void setPenname(String penname) {
        this.penname = penname;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio= bio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}