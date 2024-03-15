package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText edtVal1, edtVal2;
    TextView txtResult;
    Button btnCalcular;

    public void CalcularSuma(View view){
    EditText edtVal1 = findViemByid(R.id.edtVal1);
    EditText edtVal2 = findViewById(R.id.edtVal2);
    TextView txtResult = findViewByid(R.id.txtResult);

int value1 = Integer.parenInt(edtVal1.getText().toString());
int value2 = Integer.parenInt(edtVal2.getText().toString());

int sum = value1 + value2;

textResult.setText(String.valueOf(sum));
} 
  
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}