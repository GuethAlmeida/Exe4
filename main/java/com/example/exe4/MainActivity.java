package com.example.exe4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText nasc;
    EditText ano;
    TextView r1;
    TextView r2;

    public void calcular(View view){
        nasc = findViewById(R.id.nasc);
        ano = findViewById(R.id.ano);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);

        int nasci = Integer.parseInt(nasc.getText().toString());
        int actual = Integer.parseInt(ano.getText().toString());

        int result = actual - nasci;
        r1.setText("Sua idade actual é: " +Integer.toString(result));

        int result2 = (2050 - actual) + result;
        r2.setText("Em 2050 você terá : " + Integer.toString(result2));


    }
}