package com.example.android.mymiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colorwords = new ArrayList<Word>();

        colorwords.add(new Word("red","weṭeṭṭi",R.drawable.color_red));
        colorwords.add(new Word("green","chokokki",R.drawable.color_green));
        colorwords.add(new Word("brown","ṭakaakki",R.drawable.color_green));
        colorwords.add(new Word("gray","ṭopoppi",R.drawable.color_gray));
        colorwords.add(new Word("black","kululli",R.drawable.color_black));
        colorwords.add(new Word("white","kelelli",R.drawable.color_white));
        colorwords.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        colorwords.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this,colorwords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}