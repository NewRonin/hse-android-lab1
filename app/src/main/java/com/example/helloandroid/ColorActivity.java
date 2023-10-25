package com.example.helloandroid;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;


public class ColorActivity extends Activity {

    ConstraintLayout view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        Bundle b = getIntent().getExtras();
        int color = b.getInt("color");

        view = (ConstraintLayout) findViewById(R.id.colorLayout);
        view.setBackgroundColor(color);

    }

}
