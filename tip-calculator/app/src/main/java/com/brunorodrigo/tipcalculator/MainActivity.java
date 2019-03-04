package com.brunorodrigo.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValue;
    private TextView textViewPercent;
    private TextView textViewTip;
    private TextView textViewTotalTip;
    private SeekBar seekBarTip;
    private double percentage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValue = findViewById(R.id.editTextValue);
        textViewPercent = findViewById(R.id.textViewPercent);
        textViewTip = findViewById(R.id.textViewTip);
        textViewTotalTip = findViewById(R.id.textViewTotalTip);
        seekBarTip = findViewById(R.id.seekBarTip);

        seekBarTip.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                percentage = seekBar.getProgress();
                textViewPercent.setText(Math.round(percentage) + " %");
                calcTip();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    public void calcTip(){
        double value = 0;
        String valueString = editValue.getText().toString();

        if (!valueString.isEmpty()){
            value = Double.parseDouble(editValue.getText().toString());
        }

        double tip = value * (percentage/100);
        double total = tip + value;

        textViewTip.setText("$ "+tip);
        textViewTotalTip.setText("$ "+total);
    }
}
