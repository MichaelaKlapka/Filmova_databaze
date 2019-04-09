package com.example.filmova_databaze;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
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

    protected Film(Parcel in) {
        image = in.readInt();
        title = in.readString();
        type = in.readString();
        rating = in.readString();
    }

    public static final Creator<Film> CREATOR = new Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel in) {
            return new Film(in);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(title);
        dest.writeString(type);
        dest.writeString(rating);
    }
    // pokud by bylo private, tak musím udělat gettery a settery
}
