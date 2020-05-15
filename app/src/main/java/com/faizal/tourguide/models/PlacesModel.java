package com.faizal.tourguide.models;

public class PlacesModel {
    private String places_title;
    private String places_description;
    private int places_images_id;

    public PlacesModel(String places_title, String places_description, int places_images_id) {
        this.places_title = places_title;
        this.places_description = places_description;
        this.places_images_id = places_images_id;
    }

    public String getPlaces_title() {
        return places_title;
    }

    public String getPlaces_description() {
        return places_description;
    }


    public int getPlaces_images_id() {
        return places_images_id;
    }

}
