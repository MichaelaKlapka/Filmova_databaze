package com.example.filmova_databaze;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class OurAdapter extends ArrayAdapter {

    //ridi jak se data zobrazuji a v jakych view
    private final ArrayList<Film> films;
    private final Activity activity;

    public OurAdapter(Activity activity, ArrayList<Film> films) {
        super(activity,R.layout.list_item, films);
        this.activity = activity;
        this.films = films;
        // super zaridi, aby se neprepsal puvodni contructor
    }

    public View getView(int position, View view, ViewGroup parent){
        //nafukovac layoutu
        LayoutInflater inflater = activity.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);
        //ziskam reference na views v xml
        TextView title = rowView.findViewById(R.id.title);
        TextView info = rowView.findViewById(R.id.info);
        ImageView image = rowView.findViewById(R.id.image);
        //nevytahuju rovnou z aktivity, ale z rowView - dama tam data z listu - nemusim delat po jednom
        title.setText(films.get(position).title);
        info.setText(films.get(position).type);
        info.setText(films.get(position).rating);
        image.setImageResource(films.get(position).image);

        return rowView;
        //kdyz mam view tak musim na konci vratit nejake view - naplnime do rowView
    }
}

