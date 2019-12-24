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
        findViews();
    }

    private void findViews() {
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.arrow_left:
                Log.d("MainActivity","onClick:LEFT");
                break;
            case R.id.arrow_down:
                Log.d("MainActivity","onClick:DOWN");
                break;
            case R.id.arrow_right:
                Log.d("MainActivity","onClick:RIGHT");
                break;
            case R.id.arrow_up:
                Log.d("MainActivity","onClick:UP");
                break;
        }
    }

}
