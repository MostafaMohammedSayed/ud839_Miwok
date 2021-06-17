package com.example.android.mymiwok;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class NumbersclickListener implements View.OnClickListener {
    @Override

    public void onClick(View view){

        Toast toast = Toast.makeText(view.getContext(),"Opening Numbers list",Toast.LENGTH_SHORT);
        toast.show();

    }
}
