package com.example.firstapp.models;


public class BestItemModel {

    public String title;
    public String description;
    public String id;
    private String thumb;

    public BestItemModel() {

    }

    public BestItemModel(String title, String description, String thumb) {
        this.title = title;
        this.description = description;
        this.thumb = thumb;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}