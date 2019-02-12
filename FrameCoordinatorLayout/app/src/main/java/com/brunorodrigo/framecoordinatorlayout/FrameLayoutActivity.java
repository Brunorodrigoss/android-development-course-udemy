package com.brunorodrigo.framecoordinatorlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class FrameLayoutActivity extends AppCompatActivity {

    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        frameLayout = findViewById(R.id.frameLoading);
        frameLayout.setVisibility( View.GONE );
    }

    public void clickFrameLayout(View view){
        frameLayout.setVisibility( View.VISIBLE );
    }
}
