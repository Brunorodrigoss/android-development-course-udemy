package com.brunorodrigo.interfacecomponents;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText productName;
    private TextView result;
    private CheckBox checkBoxWhite, checkBoxGreen, checkBoxRed;
    List<String> check = new ArrayList<String>();
    private RadioGroup radioGroupStock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productName = findViewById(R.id.editTextProductName);
        result = findViewById(R.id.textViewResult);
        checkBoxWhite = findViewById(R.id.checkWhite);
        checkBoxGreen = findViewById(R.id.checkGreen);
        checkBoxRed = findViewById(R.id.checkRed);
        radioGroupStock = findViewById(R.id.radioGroupStock);

        verifyRadioButton();
    }

    public void clickSendButton(View view){
//        String productNameString = productName.getText().toString();
//        result.setText(productNameString);
//        verifyCheckBox();
    }

    public void verifyRadioButton(){
        radioGroupStock.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if ( checkedId == R.id.radioButtonYes ) {
                    result.setText("Sim");
                } else {
                    result.setText("Não");
                }
            }
        });
    }

    public void verifyCheckBox(){
        check.clear();

        if ( checkBoxWhite.isChecked() ) {
            check.add(checkBoxWhite.getText().toString());
        }

        if ( checkBoxGreen.isChecked() ) {
            check.add(checkBoxGreen.getText().toString());
        }

        if ( checkBoxRed.isChecked() ) {
            check.add(checkBoxRed.getText().toString());
        }

        result.setText(check.toString());
    }
}
