package com.wen.mapgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     findViewById(R.id.button_left);
     findViewById(R.id.button_down);
     findViewById(R.id.button_right);
     findViewById(R.id.button_up);
    }

    @Override
    public void onClick(View v) {
        Log.d("MainActivity","onClick");
    }
}
