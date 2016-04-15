package com.example.ryanrood.lapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    Button   Medication, Hydration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hydration = (Button) findViewById(R.id.Hydration);
        Medication = (Button) findViewById(R.id.Medication);



        Hydration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // When button is clicked it will go to Hydration Activity

                Intent hydration = new Intent(getBaseContext(),HydrationActivity.class);

                startActivity(hydration);


            }
        });

        Medication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //When button is clicked it will go to Medication Activity

                Intent medication = new Intent(getBaseContext(),MedicationHolder.class);

                startActivity(medication);



            }
        });
    }
}
