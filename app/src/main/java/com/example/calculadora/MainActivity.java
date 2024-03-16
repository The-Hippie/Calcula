package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void calcularSuma(View view) {
        EditText edtVal1 = findViewById(R.id.edtVal1);
        EditText edtVal2 = findViewById(R.id.edtVal2);
        TextView txtResult = findViewById(R.id.txtResult);

        String val1 = edtVal1.getText().toString();
        String val2 = edtVal2.getText().toString();

        if (val1.isEmpty() || val2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Error: ambos campos deben estar llenos", Toast.LENGTH_SHORT).show();
        } else {
            int sum = Integer.parseInt(val1) + Integer.parseInt(val2);
            txtResult.setText(String.valueOf(sum));
            Toast.makeText(MainActivity.this, "La operación se ha realizado con éxito", Toast.LENGTH_SHORT).show();
        }
    }
    public void Nuevavista(View view) {
        Intent intent = new Intent(this, Cientifica.class);
        startActivity(intent);
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}