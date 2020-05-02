package com.example.baitap_drawable_resourse;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //    TextView Tvtext ;
//    Button mbtn;
    TextView txtRating;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Tvtext = findViewById(R.id.textView);
//        mbtn = findViewById(R.id.button);
//
//        mbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Tvtext.setPaintFlags(Tvtext.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
//            }
//        });
        txtRating = (TextView)findViewById(R.id.text_rating);
        ratingBar = (RatingBar)findViewById(R.id.ratingBar_custom);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                txtRating.setText(rating +"/5");
            }
        });



    }

}
