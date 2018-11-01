package com.example.android.musicplayer69;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import static com.example.android.musicplayer69.ArtistActivity.KEY_ARTIST;
import static com.example.android.musicplayer69.ArtistActivity.KEY_SONG;


public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = getIntent();

        String PlayingSong = intent.getStringExtra(KEY_SONG);
        String playingArtist = intent.getStringExtra(KEY_ARTIST);
        int albumArt = intent.getIntExtra("ALBUM_ART",0);



        TextView currentSong = findViewById(R.id.Song);
        currentSong.setText(PlayingSong);

        TextView currentArtist = findViewById(R.id.Artist);
        currentArtist.setText(playingArtist);

        ImageView currentAlbumArt = findViewById(R.id.AlbumCover);
        currentAlbumArt.setImageResource(albumArt);

        ImageView currentArtistSmallArt = findViewById(R.id.SmallAlbumArt);
        currentArtistSmallArt.setImageResource(albumArt);



        // Sets activity_main as the layout file
        ImageView menu = findViewById(R.id.home_button);

        // creates button/ sets on click listener for Artist View
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(menuIntent);
            }
        });


    }
}
