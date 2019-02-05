package com.brunorodrigo.app1choosebylot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void drawnNumber(View view){
        TextView textView = findViewById(R.id.textViewDrawnNumber);

        int number = new Random().nextInt(11);
        textView.setText("The drawn number is: "+number);
    }
}
