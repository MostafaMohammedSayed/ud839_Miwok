package com.example.android.mymiwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    //first our own constructor so that we replace the super class constructor, this is done
    // to provide a view with 2 textviews instead of the single-text View provided by
    // the super class constructor
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);
    }

    //now we will override the method getView so that i returns the customized view we want
    //@param position is an integer representing the index of the word we want to put in a view and then displayit in our ListView
    //@param View converView is the scrap view that if already exists(!=null) we will modify its textviews
    //and if == null we will inflate a view and put our textviews in it
    //@param ViewGroup parent is the ListView in which we will put our view


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefalultTranslayion());
        ImageView imageImageView = (ImageView) listItemView.findViewById(R.id.image_image_view);
        imageImageView.setImageResource(currentWord.getmImageResourceId());

        return listItemView;

    }
}
