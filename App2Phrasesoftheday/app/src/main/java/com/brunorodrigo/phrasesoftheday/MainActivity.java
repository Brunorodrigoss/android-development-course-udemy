package com.brunorodrigo.phrasesoftheday;

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

    public void generateNewPhrase(View view){
        String [] phrases = {
                "Your limitation—it’s only your imagination.",
                "Push yourself, because no one else is going to do it for you.",
                "Sometimes later becomes never. Do it now.",
                " Great things never come from comfort zones.",
                "Dream it. Wish it. Do it.",
                "Success doesn’t just find you. You have to go out and get it.",
                "The harder you work for something, the greater you’ll feel when you achieve it.",
                "Dream bigger. Do bigger.",
                "Don’t stop when you’re tired. Stop when you’re done.",
                "Wake up with determination. Go to bed with satisfaction."
        };

        TextView textView = findViewById(R.id.textResult);
        textView.setText(phrases[new Random().nextInt(phrases.length)]);
    }
}
