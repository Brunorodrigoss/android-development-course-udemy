package com.brunorodrigo.framecoordinatorlayout;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view){
        switch (view.getId()){
            case R.id.buttonFrameId:
                Intent intentFrame = new Intent(this, FrameLayoutActivity.class);
                startActivity(intentFrame);
                break;

            case R.id.buttonCoordinatorId:
                Intent intentCoordinator = new Intent(this, CoordinatorLayoutActivity.class);
                startActivity(intentCoordinator);
                break;
        }
    }
}
