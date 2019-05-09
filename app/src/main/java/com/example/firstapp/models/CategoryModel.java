package com.example.firstapp.models;

public class CategoryModel {

    private String Title;
    private String Category;
    private String Description;
    private int Thumvnail;

    public CategoryModel(int thumvnail, String title) {
        Title = title;
        Thumvnail = thumvnail;
    }



    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getThumvnail() {
        return Thumvnail;
    }

    public void setThumvnail(int thumvnail) {
        Thumvnail = thumvnail;
    }
}
