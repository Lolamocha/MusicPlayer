package com.example.android.musicplayer;


public class Song {

    private String mTitleSong;
    private String mArtistName;
    private String mAlbumName;
    private int mThumbnail;

    Song(String titleSong, String artistName, String albumName, int thumbnail) {
        mTitleSong = titleSong;
        mArtistName = artistName;
        mAlbumName = albumName;
        mThumbnail = thumbnail;
}
    String getTitleSong() {return mTitleSong;}
    String getArtistName() {return mArtistName;}
    String getAlbumName() {return mAlbumName;}
    int getThumbnail() {return mThumbnail;}
}
