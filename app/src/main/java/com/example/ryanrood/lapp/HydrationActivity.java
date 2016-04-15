package com.example.ryanrood.lapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HydrationActivity extends AppCompatActivity {

        EditText intake, excrete;
        Button AddHydration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hydration2);

        intake = (EditText) findViewById(R.id.editText);
        excrete = (EditText) findViewById(R.id.editText2);
        AddHydration =(Button) findViewById(R.id.button);



        AddHydration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When button is clicked it will add to daily total database





            }
        });





    }
}
