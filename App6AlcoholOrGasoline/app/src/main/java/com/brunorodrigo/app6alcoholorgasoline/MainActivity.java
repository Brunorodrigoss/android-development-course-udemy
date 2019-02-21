package com.brunorodrigo.app6alcoholorgasoline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editAlcoholPrice;
    private EditText editGasolinePrice;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcoholPrice = findViewById(R.id.editAlcoholPrice);
        editGasolinePrice = findViewById(R.id.editGasolinePrice);
        textResult = findViewById(R.id.textResult);
    }

    public void clickButton(View view) {
        String alcoholPrice = editAlcoholPrice.getText().toString();
        String gasolinePrice = editGasolinePrice.getText().toString();

        if (checkFields(alcoholPrice, gasolinePrice)){
            this.calculateBetterPrice(alcoholPrice, gasolinePrice);
        } else {
            textResult.setText("Fill the fields first!");
        }
    }

    public Boolean checkFields(String pAlcohol, String pGasoline) {
        boolean checkFields = true;

        if (pAlcohol == null || pAlcohol.equals("")){
            checkFields = false;
        } else if (pGasoline == null || pGasoline.equals("")){
            checkFields = false;
        }

        return checkFields;
    }

    public void calculateBetterPrice(String pAlcohol, String pGasoline) {
        double alcoholPrice = Double.parseDouble(pAlcohol);
        double gasolinePrice = Double.parseDouble(pGasoline);

        double result = alcoholPrice / gasolinePrice;

        if (result >= 0.7) {
            textResult.setText("It's better to use gasoline.");
        } else {
            textResult.setText("It's better to use alcohol.");
        }

    }
}
