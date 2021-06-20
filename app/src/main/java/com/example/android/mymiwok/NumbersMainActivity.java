package com.example.android.mymiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.word_list);

        //creating an ArrayList of the data we want to display in Numbers Activity then
        //adding first data item in a TextView then making this Text view a child of
        // the Linear Layout of the Numbers category

        ArrayList <Word> words = new ArrayList <Word> ();

        words.add(new Word("one","lutti",R.drawable.number_one));
        words.add(new Word("two","otiiko",R.drawable.number_two));
        words.add(new Word("three","tolookosu",R.drawable.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five));
        words.add(new Word("six","temmokka",R.drawable.number_six));
        words.add(new Word("seven","kenekaku",R.drawable.number_seven));
        words.add(new Word("eight","kawinta",R.drawable.number_eight));
        words.add(new Word("nine","wo'e",R.drawable.number_nine));
        words.add(new Word("ten","na'aacha",R.drawable.number_ten));


        //added array adapter to optimize memory usage by the app
        //forgot to say we totally changed the layout of Numbers in the xml file

        WordAdapter adapter = new WordAdapter (this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}