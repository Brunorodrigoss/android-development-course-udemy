package com.brunorodrigo.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String [] cities = {
            "Ho Chi Minh City", "Budapest", "Ulsan", "Ekurhuleni",
            "Almaty", "Shijiazhuang", "Lahore", "Havana",
            "Dar es Salaam", "New York City", "Semarang", "Sydney",
            "Hyderabad", "Mashhad", "Toronto"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //Adapter
        ArrayAdapter<String>  adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                cities
        );

        // Add adapter on the list
        listView.setAdapter(adapter);

        // Add click on the list
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedValue = listView.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), selectedValue, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
