package com.example.android.musicplayer69;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.musicplayer69.ArtistActivity.KEY_ARTIST;
import static com.example.android.musicplayer69.ArtistActivity.KEY_SONG;
import static com.example.android.musicplayer69.ArtistActivity.Key_AlbumArt;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        String playingSong = "";
        String playingArtist = "";
        String nowPlayingSong = "";




        Intent intent = getIntent();
        if (null != intent) {
            playingSong = intent.getStringExtra(KEY_SONG);
            playingArtist = intent.getStringExtra(KEY_ARTIST);
            nowPlayingSong = intent.getIntegerArrayListExtra(Key_AlbumArt);
            {
            }
            
             {
            }


        }

// Sets data to appropriate TextViews
        TextView playingSongText = (TextView) findViewById(R.id.Song);
        playingSongText.setText(playingSong);


        TextView playingArtistText = (TextView) findViewById(R.id.Artist);
        playingArtistText.setText(playingArtist);

        ImageView CurrentAlbumArt = findViewById(R.id.AlbumCover);
        CurrentAlbumArt.setImageResource(Integer.parseInt(nowPlayingSong));




        // Sets activity_main as the layout file
        ImageView menu = findViewById(R.id.home_button);

        // creates button/ sets on click listener for Artist View
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuIntent = new Intent(MainActivity.this, menuActivity.class);
                startActivity(menuIntent);
            }
        });


    }
}
