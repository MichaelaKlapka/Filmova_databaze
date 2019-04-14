package com.example.filmova_databaze;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.TextView;

        import com.bumptech.glide.Glide;

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
        TextView type = findViewById(R.id.type);
        TextView rating = findViewById(R.id.rating);
        TextView description = findViewById(R.id.description);
        ImageView image = findViewById(R.id.image);
        Glide.with(this).load(films.image).into(image);
        //nevytahuju rovnou z aktivity, ale z rowView - dama tam data z listu - nemusim delat po jednom
        type.setText(films.type);
        rating.setText(films.rating);
        description.setText (films.description);

    }
}
