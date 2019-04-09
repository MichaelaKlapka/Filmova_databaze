package com.example.filmova_databaze;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

        import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    public ArrayList<Film> films;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Film films = getIntent().getParcelableExtra("data");
        setTitle(films.title);
        //nazev filmu jsem nastavila jako title aktivity a poslala jsem si udaje z prvni aktivity
    }
}
