package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity  {

    private static final String INTENT_KEY_ARTIST = "artist";
    private static final String INTENT_KEY_ALBUM = "album";
    private static final String INTENT__KEY_TITLE = "title";

    public Detail() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().getExtras()!=null){
            String artist = getIntent().getExtras().getString(INTENT_KEY_ARTIST);
            if (getIntent().getExtras()!=null){
                String album = getIntent().getExtras().getString(INTENT_KEY_ALBUM);
                if (getIntent().getExtras()!=null){
                    String title = getIntent().getExtras().getString(INTENT__KEY_TITLE);
                }
            }
        }
        setContentView(R.layout.activity_song);
        getSupportActionBar().setTitle("Detail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


         final ImageButton play = findViewById(R.id.play);
         play.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
         if (play.isPressed()) {
           play.setImageResource(R.drawable.ic_pause_48dp);}
         }});

        TextView songTitleTextView = findViewById(R.id.txt_title);
        TextView albumNameTextView = findViewById(R.id.txt_album);
        TextView artistNameTextView = findViewById(R.id.txt_artist);
        ImageView imgThumbnail = findViewById(R.id.img_thumbnail);

     //keep data
        Intent intent = getIntent();

        String artistName = intent.getExtras().getString("ArtistName");
        String albumName = intent.getExtras().getString("AlbumName");
        String titleSong = intent.getExtras().getString("TitleSong");
        int thumbnail = intent.getExtras().getInt("Thumbnail");

        //setting value
        songTitleTextView.setText(titleSong);
        artistNameTextView.setText(artistName);
        albumNameTextView.setText(albumName);
        imgThumbnail.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgThumbnail.setImageResource(thumbnail);
    }
   }