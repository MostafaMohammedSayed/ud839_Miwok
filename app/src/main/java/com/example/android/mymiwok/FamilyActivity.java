package com.example.android.mymiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> familyWords = new ArrayList<Word>();

        familyWords.add(new Word("father","әpә",R.drawable.family_father,R.raw.family_father));
        familyWords.add(new Word("mother","әṭa",R.drawable.family_mother,R.raw.family_mother));
        familyWords.add(new Word("son","angsi",R.drawable.family_son,R.raw.family_son));
        familyWords.add(new Word("daughter","tune",R.drawable.family_daughter,R.raw.family_daughter));
        familyWords.add(new Word("older brother" ,"taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        familyWords.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        familyWords.add(new Word("older sister","teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        familyWords.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        familyWords.add(new Word("grandmother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        familyWords.add(new Word("grandfather","paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter adapter = new WordAdapter(this,familyWords,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = familyWords.get(position);
                player = MediaPlayer.create(FamilyActivity.this,word.getmAudioResourceId());
                player.start();
            }
        });
    }
}