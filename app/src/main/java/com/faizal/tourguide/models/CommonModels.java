package com.faizal.tourguide.models;

public class CommonModels {
    private String title;
    private String about;

    public CommonModels(String title, String about) {
        this.title = title;
        this.about = about;
    }

    public String getTitle() {
        return title;
    }

    public String getAbout() {
        return about;
    }
}
