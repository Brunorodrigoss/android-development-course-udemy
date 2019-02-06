package com.brunorodrigo.app3rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectedOption(View view) {
        int[] options = {R.id.imageViewRock, R.id.imageViewPaper, R.id.imageViewScissors};
        int optionApp = options[new Random().nextInt(options.length)];
        TextView textView = findViewById(R.id.textViewResult);
        ImageView imageView = findViewById(R.id.imageResult);
        switch (view.getId()) {
            case R.id.imageViewRock:
                switch (optionApp) {
                    case R.id.imageViewRock:
                        imageView.setImageResource(R.drawable.pedra);
                        textView.setText("Game tied! :|");
                        break;
                    case R.id.imageViewPaper:
                        imageView.setImageResource(R.drawable.papel);
                        textView.setText("You lost! :(");
                        break;
                    case R.id.imageViewScissors:
                        imageView.setImageResource(R.drawable.tesoura);
                        textView.setText("You are won! :)");
                        break;

                }
                break;
            case R.id.imageViewPaper:
                switch (optionApp) {
                    case R.id.imageViewRock:
                        imageView.setImageResource(R.drawable.pedra);
                        textView.setText("You are won! :)");
                        break;
                    case R.id.imageViewPaper:
                        imageView.setImageResource(R.drawable.papel);
                        textView.setText("Game tied! :|");
                        break;
                    case R.id.imageViewScissors:
                        imageView.setImageResource(R.drawable.tesoura);
                        textView.setText("You lost! :(");
                        break;
                }
                break;
            case R.id.imageViewScissors:
                switch (optionApp) {
                    case R.id.imageViewRock:
                        imageView.setImageResource(R.drawable.pedra);
                        textView.setText("You lost! :(");
                        break;
                    case R.id.imageViewPaper:
                        imageView.setImageResource(R.drawable.papel);
                        textView.setText("You are won! :)");
                        break;
                    case R.id.imageViewScissors:
                        imageView.setImageResource(R.drawable.tesoura);
                        textView.setText("Game tied! :|");
                        break;
                }
                break;
        }
    }
}
