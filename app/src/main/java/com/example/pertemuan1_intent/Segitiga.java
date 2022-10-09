package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas =
                (EditText)findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.input_tinggi);
        final EditText hasil_t =
                (EditText)findViewById(R.id.output_luas);
        final Button hitung =
            (Button) findViewById(R.id.btn_luas);
        hitung.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                String alas1 = alas.getText().toString();
                String tinggi1 = tinggi.getText().toString();
                double alas = Double.parseDouble(alas1);
                double tinggi = Double.parseDouble(tinggi1);
                double hs = hitung(alas,tinggi);
                String luas = String.valueOf(hs);
                hasil_t.setText(luas);
                }
        });
    }
    public double hitung(double a, double t){return a*t/2;}
}