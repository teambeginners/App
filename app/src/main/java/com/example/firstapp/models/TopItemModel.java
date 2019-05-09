package com.example.firstapp.models;



public class TopItemModel {

    int imageView1;
    String textView1, textView2;

    public TopItemModel(int imageView1, String textView1, String textView2) {
        this.imageView1 = imageView1;
        this.textView1 = textView1;
        this.textView2 = textView2;
    }

    public int getImageView1() {
        return imageView1;
    }

    public void setImageView1(int imageView1) {
        this.imageView1 = imageView1;
    }


    public String getTextView1() {
        return textView1;
    }

    public void setTextView1(String textView1) {
        this.textView1 = textView1;
    }

    public String getTextView2() {
        return textView2;
    }

    public void setTextView2(String textView2) {
        this.textView2 = textView2;
    }


}
