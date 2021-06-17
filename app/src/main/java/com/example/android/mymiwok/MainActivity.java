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

        NumbersclickListener numbersclickListener= new NumbersclickListener();

        TextView numbersTextview = (TextView) findViewById(R.id.numbers);

        numbersTextview.setOnClickListener(numbersclickListener);
    }

//    public void openNumbersList (View view){
//        //Now on click the numbers screen opens (via xml onClick & java intent to start numbers)
//        Intent intent = new Intent (this, NumbersMainActivity.class);
//        startActivity(intent);
//    }
}