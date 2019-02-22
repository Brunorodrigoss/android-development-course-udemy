package com.brunorodrigo.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openToast(View view){

        /*
        Simple Toast
         */
        //        Toast.makeText(getApplicationContext(), "Pressed button", Toast.LENGTH_LONG).show();

        /*
        Customized Toast below
         */
        ImageView image = new ImageView(getApplicationContext());
        image.setImageResource(android.R.drawable.star_big_off);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(image);
        toast.show();
    }
}
