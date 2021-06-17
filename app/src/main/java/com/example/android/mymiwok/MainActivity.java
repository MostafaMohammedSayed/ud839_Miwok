package com.example.android.mymiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting onclick listener with much fewer code lines.
        //note that we changed the category label in android manifest file so it
        // shows Numbers im stead of the app name when the numbers activity opens.

        TextView numbersTextview = (TextView) findViewById(R.id.numbers);

        numbersTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,NumbersMainActivity.class);
                startActivity(intent);
            }
        });

    }
}