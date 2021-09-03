package com.example.tutorial;

import android.view.View;
import android.widget.TextView;

public class CountOnClickListener {
    private TextView countTextView;
    private int theCount;

    public CountOnClickListener(TextView ctv){
        countTextView = ctv;
        theCount = 0;
    }

    public void onClick(View v){
        theCount++;
        countTextView.setText("" + theCount);
    }
}
