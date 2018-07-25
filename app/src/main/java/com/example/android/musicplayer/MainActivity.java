package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Song1","Artist1","AlbumName1",R.drawable.ic_musicnote_48dp));
        songs.add(new Song("Song2","Artist2","AlbumName2",R.drawable.ic_musicnote_48dp));
        songs.add(new Song("Song3","Artist3","AlbumName3",R.drawable.ic_musicnote_48dp));
        songs.add(new Song("Song4","Artist4","AlbumName4",R.drawable.ic_musicnote_48dp));
        songs.add(new Song("Song5","Artist5","AlbumName5",R.drawable.ic_musicnote_48dp));
        songs.add(new Song("Song6","Artist6","AlbumName6",R.drawable.ic_musicnote_48dp));
        songs.add(new Song("Song7","Artist7","AlbumName7",R.drawable.ic_musicnote_48dp));
        songs.add(new Song("Song8","Artist8","AlbumName8",R.drawable.ic_musicnote_48dp));
        songs.add(new Song("Song9","Artist9","AlbumName9",R.drawable.ic_musicnote_48dp));
        songs.add(new Song("Song10","Artist10","AlbumName10",R.drawable.ic_musicnote_48dp));
        songs.add(new Song("Song11","Artist11","AlbumName11",R.drawable.ic_musicnote_48dp));
        songs.add(new Song("Song12","Artist12","AlbumName12",R.drawable.ic_musicnote_48dp));

        RecyclerView songsRecyclerView = findViewById(R.id.recyclerview_id);
        SongAdapter myAdapter = new SongAdapter(this, songs);
        songsRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        songsRecyclerView.setAdapter(myAdapter);
    }
}
// this is my first test code//