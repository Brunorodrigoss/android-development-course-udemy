package com.brunorodrigo.interfacecomponents2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch switchRememberPassword;
    private ToggleButton toggleButton;
    private CheckBox checkBox;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchRememberPassword = findViewById(R.id.switchState);
        toggleButton = findViewById(R.id.toggleButtonState);
        checkBox = findViewById(R.id.checkBoxState);
        textView = findViewById(R.id.result);

    }

    public void send(View view){
        String textResult = "";

        if (switchRememberPassword.isChecked()) {
            textResult += "Switch is On\n";
        } else {
            textResult += "Switch is Off\n";
        }

        if (toggleButton.isChecked()) {
            textResult += "Toggle is On\n";
        } else {
            textResult += "Toggle is Off\n";
        }

        if (checkBox.isChecked()) {
            textResult += "CheckBox is On\n";
        } else {
            textResult += "CheckBox is Off\n";
        }
        textView.setText(textResult);
    }
}
