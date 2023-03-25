package com.example.conversionnikhilbhosalev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText milesInput;
    private TextView kilometersOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milesInput = findViewById(R.id.miles_input);
        kilometersOutput = findViewById(R.id.kilometers_output);

        Button convertButton = findViewById(R.id.convert_button);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String miles = milesInput.getText().toString();
                double kilometers;
                if(!miles.isEmpty()){
                    kilometers = convertMilesToKilometers(miles);
                    kilometersOutput.setText(String.valueOf(kilometers));}
                else {
                    kilometersOutput.setText("Input is Empty. Please Enter valid input");
                }

            }
        });

    }

    private double convertMilesToKilometers(String miles){
        double milesValues = Double.parseDouble(miles);
        return milesValues * 1.609;
    }
}