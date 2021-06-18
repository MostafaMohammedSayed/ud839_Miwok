package com.example.android.mymiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_numbers_main);

        //creating an ArrayList of the data we want to display in Numbers Activity then
        //adding first data item in a TextView then making this Text view a child of
        // the Linear Layout of the Numbers category

        ArrayList <Word> words = new ArrayList <Word> ();

        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));

        //added array adapter to optimize memory usage by the app
        //forgot to say we totally changed the layout of Numbers in the xml file

        ArrayAdapter <Word> arrayAdapter = new ArrayAdapter<String> (this,R.layout.list_item,words);
        //but the previous line gives a compiler error that says that the arrayAdapter different constructors
        //do no match with the parameters that we provided, the problem seems to be in the last parameter (words)
        //as the error says the constructor takes an ArrayList<String> not ArrayList<words>. Looks like we are
        //gonna improvise and make our own adapter (To be Continued...)
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(arrayAdapter);
    }
}