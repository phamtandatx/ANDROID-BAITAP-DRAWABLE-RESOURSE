package com.example.baitap_drawable_resourse;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtRating;
    RatingBar ratingBar;
    public String string_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRating = (TextView) findViewById(R.id.text_rating);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar_custom);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                string_value = (String.valueOf(rating));
                String num_star = "5";
                String sourceString = "<big>" + "<b>" + string_value + "</b> " + "</big>" + "/" + num_star;
                txtRating.setText(Html.fromHtml(sourceString));
            }
        });
    }

}
