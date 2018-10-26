package com.example.android.musicplayer69;


public class Song {


    /** takes song name */

    private String Song;


    /** takes artist name */

    private  String Artist;

    /** takes Album name */

    private  String Albums;

    /** takes album art*/

    private int albumArt;




    /** constructor that takes the three inputs */

    public Song(String songName, String artistName, String albumName, int CoverArt){




        Song = songName;
        Artist = artistName;
        Albums = albumName;
        albumArt = CoverArt;

    }

    /**get song name*/
    public String getmSong() {
        return Song;
    }

    /**get artist name*/

    public String getmArtist() {
        return Artist;
    }

    /**get album name*/

    public String getAlbums() {return Albums;}

    /** get album art*/

    public int getAlbumArt() {return  albumArt;}




}
