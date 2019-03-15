package com.brunorodrigo.app7tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValue;
    private TextView textPorcentage;
    private TextView textTip;
    private TextView textTotal;
    private SeekBar seekTip;

    private double porcentage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValue = findViewById(R.id.editValue);
        textTip = findViewById(R.id.textGorjeta);
        textPorcentage = findViewById(R.id.textPorcentagem);
        textTotal = findViewById(R.id.textTotal);
        seekTip = findViewById(R.id.seekTip);

        //Controlar seekbar
        seekTip.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                porcentage = seekBar.getProgress();
                textPorcentage.setText( Math.round(porcentage) + "%");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void calcular(){
        double typedValue;

        if (editValue.getText().toString().isEmpty()){
            typedValue = 0;
        } else {
            typedValue = Double.parseDouble( editValue.getText().toString() );
        }

        //calcula a gorjeta total
        double tip = typedValue * (porcentage /100);
        double total = tip + typedValue;

        //exibe a gorjeta total
        textTip.setText("R$ " + Math.round(tip) );
        textTotal.setText("R$ " + total);

    }

}

