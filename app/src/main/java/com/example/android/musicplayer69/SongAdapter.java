package com.example.android.musicplayer69;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * This is the constructor for the context is to inflate the  layout file
     * abd tge list is the ata we want  to populate into the lists.
     *
     * @param context the current context. Used to Inflate the layout file
     * @param Song    A list of Word object to display on the list
     */


    public SongAdapter(Activity context, ArrayList<Song> Song) {

        // This code initializes the ArrayAdapter's internal storage for the context and the list
        // The second argument is used when ArrayAdapter is populating a single TextView.
        //Because this is a custom adapter for two Text views and and ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Song);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTextView = (TextView) listItemView.findViewById(R.id.songListView);
        // Get the version name from the current  song object and
        // set this text on the song TextView
        songTextView.setText(currentSong.getmSong());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.ArtistListView);
        // Get the version number from the current  artist and
        // set this text on the artist TextView
        artistTextView.setText(currentSong.getmArtist());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView albumsTextView = (TextView) listItemView.findViewById(R.id.AlbumListView);
        // Get the version number from the current album and
        // set this text on the album TextView
        albumsTextView.setText(currentSong.getAlbums());

        // Find the image view in the iist_item.xml layout with the ID Version number

        ImageView AlbumArtImageView = listItemView.findViewById(R.id.albumArt);
        //get the version number from the current image object and
        //set the image to the album art text text view.
        AlbumArtImageView.setImageResource(currentSong.getAlbumArt());

        return listItemView;
    }
}