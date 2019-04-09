package com.example.filmova_databaze;

public class Film {
    public int image;
    public String title;
    public String type;
    public String rating;

    public Film(int image, String title, String type, String rating) {
        this.image = image;
        this.title = title;
        this.type = type;
        this.rating = rating;
    }
    // pokud by bylo private, tak musím udělat gettery a settery
}
