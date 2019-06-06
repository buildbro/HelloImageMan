package com.buildbrothers.helloimageman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    //We are getting the image linked in the String Constant below to show on our ImageView
    private static final String IMAGE_URL = "https://www.decolore.net/wp-content/uploads/2018/03/30-free-stock-photos-beautiful-people-using-smartphone-cover.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView demoImageView = findViewById(R.id.demo_image_view);

        //This is where Picasso Library does its magic saving us a lot of code
        Picasso.get().load(IMAGE_URL).into(demoImageView);
    }
}
