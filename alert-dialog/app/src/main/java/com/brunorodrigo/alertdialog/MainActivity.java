package com.brunorodrigo.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view){
        // Create AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        // Title and message
        dialog.setTitle("Title");
        dialog.setMessage("Message");

        // Cancel Setup
        dialog.setCancelable(false);

        // Icon Setup
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);

        // Setup button actions
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Yes was pressed!", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "No was pressed!", Toast.LENGTH_SHORT).show();
            }
        });

        // Create and Show AlertDialog
        dialog.create();
        dialog.show();
    }
}
