package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button mainButton;
    TextView input;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.editText);
        mainButton = findViewById(R.id.mainButton);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 0;
                switch (input.getText().toString()){
                    case "red":
                        color = getColor(R.color.red);
                        break;
                    case "green":
                        color = getColor(R.color.green);
                        break;
                    case "blue":
                        color = getColor(R.color.blue);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), getString(R.string.input_warning), Toast.LENGTH_LONG).show();
                        break;
                }

                if (color != 0){
                    Intent intent = new Intent(getApplicationContext(), ColorActivity.class);
                    intent.putExtra("color", color);
                    startActivity(intent);
                }

            }
        });
    }




}
