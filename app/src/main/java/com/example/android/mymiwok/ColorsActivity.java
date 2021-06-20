package com.example.android.mymiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> colorwords = new ArrayList<Word>();

        colorwords.add(new Word("red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        colorwords.add(new Word("green","chokokki",R.drawable.color_green,R.raw.color_green));
        colorwords.add(new Word("brown","ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        colorwords.add(new Word("gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        colorwords.add(new Word("black","kululli",R.drawable.color_black,R.raw.color_black));
        colorwords.add(new Word("white","kelelli",R.drawable.color_white,R.raw.color_white));
        colorwords.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colorwords.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this,colorwords,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = colorwords.get(position);
                player = MediaPlayer.create(ColorsActivity.this,word.getmAudioResourceId());
                player.start();
            }
        });
    }
}