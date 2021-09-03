package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView helloTextView = (TextView) findViewById(R.id.helloTextView);
    TextView countTextView = (TextView) findViewById(R.id.countTextView);
    TextView progressTextView = (TextView) findViewById(R.id.progressTextView);

    Button helloButton = (Button) findViewById(R.id.helloButton);
    Button countButton = (Button) findViewById(R.id.countButton);
    SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);

    seekBar.setOnSeekBarChangeListener(new ProgressUpdateListener(progressTextView));

    ProgressUpdateListener theSeekListener =
            new ProgressUpdateListener(progressTextView, countButton)

    countButton.setOnClickListener(new CountOnClickListener(countTextView));
    helloButton.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            helloTextView.setText("Hello");
        }
    });


}