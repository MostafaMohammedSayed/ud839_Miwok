package com.example.android.mymiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> colorwords = new ArrayList<Word>();

        colorwords.add(new Word("red","weṭeṭṭi"));
        colorwords.add(new Word("green","chokokki"));
        colorwords.add(new Word("brown","ṭakaakki"));
        colorwords.add(new Word("gray","ṭopoppi"));
        colorwords.add(new Word("black","kululli"));
        colorwords.add(new Word("white","kelelli"));
        colorwords.add(new Word("dusty yellow","ṭopiisә"));
        colorwords.add(new Word("mustard yellow","chiwiiṭә\n"));

        WordAdapter adapter = new WordAdapter(this,colorwords);

        ListView listView = (ListView) findViewById(R.id.colorsListView);

        listView.setAdapter(adapter);


    }
}