package com.example.juwatow.mikmconverter;

import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConvMiToKm = (Button)findViewById(R.id.buttonConvMiToKm);
        buttonConvMiToKm.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                EditText editTextMi = (EditText)findViewById(R.id.editTextMi);
                EditText editTextKm = (EditText)findViewById(R.id.editTextKm);
                double vMi = Double.valueOf(editTextMi.getText().toString());
                double vKm = vMi / 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                editTextKm.setText(formatVal.format(vKm));
            }
        });

        Button buttonConvKmToMi = (Button)findViewById(R.id.buttonConvKmToMi);
        buttonConvKmToMi.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                EditText editTextKm = (EditText)findViewById(R.id.editTextKm);
                EditText editTextMi = (EditText)findViewById(R.id.editTextMi);
                double vKm = Double.valueOf(editTextKm.getText().toString());
                double vMi = vKm * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                editTextMi.setText(formatVal.format(vMi));
            }
        });
    }
}
