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

        ArrayList <String> words = new ArrayList <String> ();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        //added array adapter to optimize memory usage by the app
        //forgot to say we totally changed the layout of Numbers in the xml file

        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(arrayAdapter);
    }
}