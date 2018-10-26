package com.example.android.musicplayer69;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class menuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_items);


        // Sets activity_main as the layout file
        TextView artist = findViewById(R.id.Artist_Name);

        // creates button/ sets on click listener for Artist View
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(menuActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });


    }
}
