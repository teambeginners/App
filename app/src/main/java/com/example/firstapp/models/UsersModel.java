package com.example.firstapp.models;



public class UsersModel {

    int usersImg;
    String userName, userJoion, approved, pending;

    public UsersModel(int imageView1, String textView1, String textView2, String textView3, String textView4) {
        this.usersImg = imageView1;
        this.userName = textView1;
        this.userJoion = textView2;
        this.pending = textView3;
        this.approved = textView4;
    }


    public int getImageView1() {
        return usersImg;
    }

    public void setImageView1(int imageView1) {
        this.usersImg = imageView1;
    }


    public String getTextView1() {
        return userName;
    }

    public void setTextView1(String textView1) {
        this.userName = textView1;
    }

    public String getTextView2() {
        return userJoion;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }

    public void setTextView2(String textView2) {
        this.userJoion = textView2;
    }


}
