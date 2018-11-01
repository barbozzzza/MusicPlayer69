package com.example.android.musicplayer69;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {
    public static final String KEY_SONG = "KEY_SONG";
    public static final String KEY_ARTIST = "KEY_ARTIST";


    // I am not certain how to declare this variable in order to be able to call it in the other activity.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<Song> song = new ArrayList<Song>();


        /** words.add("one")*/

        song.add(new Song("Last Night", "The Strokes", "Is this It",R.drawable.albumcover));
        song.add(new Song("Golden Fleeces", "Israel Nash", "Lifted",R.drawable.goldenfleece));
        song.add(new Song("Heavy, California", "Jungle", "Heavy California",R.drawable.heavycalifornia));
        song.add(new Song("Grow Up", "Boiler", "Grow Up",R.drawable.boiler));
        song.add(new Song("The Ballad of the Costa Concordia", "Car Seat Head Rest", "Teens of Denial",R.drawable.thebaladofthecostaconcordia));
        song.add(new Song("Leaving", "Bass Drum of Death", "Just Business",R.drawable.justbusiness));
        song.add(new Song("Creature Comfort", "Woods", "City Sun Eater in the River of Light",R.drawable.theriveroflight));
        song.add(new Song("Summer with Phill", "Dead Ghost", "Can't Get No",R.drawable.cantgetno));
        song.add(new Song("Night Ride", "The Growlers", "Night Ride",R.drawable.nightride));


        final SongAdapter adapter = new SongAdapter(this, song);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);


        // When listView item is clicked, item data is sent to new activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song item = adapter.getItem(position);
                Intent intent = new Intent(ArtistActivity.this, MainActivity.class);
                intent.putExtra(KEY_SONG, item.getmSong());
                intent.putExtra(KEY_ARTIST, item.getmArtist());
                intent.putExtra("ALBUM_ART",item.getAlbumArt());
                startActivity(intent);}






        });



    }



}











