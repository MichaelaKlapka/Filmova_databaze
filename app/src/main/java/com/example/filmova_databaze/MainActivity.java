package com.example.filmova_databaze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Film> films;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        films = new ArrayList<>();
        films.add(new Film(R.drawable.amelie_des_abbesses,"Amélie des Abbesses", "Comedy, Drama, Romantic","85 %"));
        films.add(new Film(R.drawable.limitless,"Limitless", "Mysterious, Sci-Fi, Thiller","81 %"));
        films.add(new Film(R.drawable.intouchables,"Intouchables", "Comedy, Drama, Biographical", "91 %"));
        films.add(new Film(R.drawable.pulp_fiction,"Pulp Fiction", "Crimi, Drama","91 %"));
        films.add(new Film(R.drawable.the_butterfly_effect,"The Butterfly Effect", "Sci-Fi, Mysterious, Thiller","87 %"));
        films.add(new Film(R.drawable.star_wars_v,"Star Wars: Episode V - The Empire Strikes Back", "Sci-Fi, Fantasy, Action","89 %"));
        films.add(new Film(R.drawable.inception,"Inception", "Thiller, Mysterious, Action, Sci-Fi, Adventurous","89 %"));
        films.add(new Film(R.drawable.matrix,"The Matrix", "Action, Sci-Fi","90 %"));
        films.add(new Film(R.drawable.the_lord_of_the_rings,"The Lord of the Rings: The Fellowship of the Ring", "Fantasy, Adventurous, Action","90 %"));
        films.add(new Film(R.drawable.pelisky,"Pelíšky", "Comedy, Drama","91 %"));
        //slo by doplnovat pomoci ArrayListu - aby se nemuselo psat

        OurAdapter adapter = new OurAdapter(this, films);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
