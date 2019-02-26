package com.brunorodrigo.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private ProgressBar progressBarLoading;
    private int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        progressBarLoading = findViewById(R.id.progressBarLoading);
        progressBarLoading.setVisibility(View.GONE);
    }

    public void loadPorgressBar(View view){
        progressBarLoading.setVisibility(View.VISIBLE);
        this.progress = this.progress + 10;

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i ++){

                    final int progress = i;

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progress);
                            if (progress == 100) {
                                progressBarLoading.setVisibility(View.GONE);
                            }
                        }
                    });
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
//        progressBar.setProgress(progress);
    }
}
