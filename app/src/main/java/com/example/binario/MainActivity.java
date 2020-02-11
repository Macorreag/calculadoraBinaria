package com.example.binario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView salBin, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salBin = (TextView) findViewById(R.id.salida);
        result = (TextView) findViewById(R.id.result);
    }

    public static long convertir(String binario) {

        long decimal = 0;
        int posicion = 0;

        for (int x = binario.length() - 1; x >= 0; x--) {

            short digito = 1;
            if (binario.charAt(x) == '0') {
                digito = 0;
            }
            double multiplicador = Math.pow(2, posicion);
            decimal += digito * multiplicador;
            posicion++;
        }
        return decimal;
    }


    public void onClickZero(View view){
        String x = salBin.getText().toString()+"0";
        salBin.setText(x);
        result.setText(Long.toString(convertir(x)));
    }


    public void onClickOne(View view){
        String x = salBin.getText().toString()+"1";
        salBin.setText(x);
        result.setText(Long.toString(convertir(x)));
    }


    public void onClickClear(View view) {
        salBin.setText("");
        result.setText("");
    }
}
