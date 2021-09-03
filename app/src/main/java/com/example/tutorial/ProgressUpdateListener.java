package com.example.tutorial;

import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class ProgressUpdateListener implements SeekBar.OnSeekBarChangeListener{
    private TextView progressTextView;
    private Button countButton;

    public ProgressUpdateListener(TextView ptv, Button countButton){
        progressTextView = ptv;
    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        progressTextView.setText("" + i);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
