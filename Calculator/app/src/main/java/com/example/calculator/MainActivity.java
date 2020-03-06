package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text=findViewById(R.id.number1Text);
        number2Text=findViewById(R.id.number2Text);
        resultText=findViewById(R.id.resultText);

        resultText.setText("test");
    }

    public void sum (View view){
        if(number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()){
            resultText.setText("Please Enter Number!");
        }
        else {


            int sayi1 = Integer.parseInt(number1Text.getText().toString());
            int sayi2 = Integer.parseInt(number2Text.getText().toString());
            int resultInteger = sayi1 + sayi2;

            resultText.setText("Result: " + resultInteger);
        }
    }
    public void subtraction (View view){
        if(number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()){
            resultText.setText("Please Enter Number!");
        }
        else {


            int sayi1 = Integer.parseInt(number1Text.getText().toString());
            int sayi2 = Integer.parseInt(number2Text.getText().toString());
            int resultInteger = sayi1 - sayi2;

            resultText.setText("Result: " + resultInteger);
        }
    }

    public void multiply(View view){
        if(number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()){
            resultText.setText("Please Enter Number!");
        }
        else {


            int sayi1 = Integer.parseInt(number1Text.getText().toString());
            int sayi2 = Integer.parseInt(number2Text.getText().toString());
            int resultInteger = sayi1 * sayi2;

            resultText.setText("Result: " + resultInteger);
        }
    }
    public void divide(View view){
        if(number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()){
            resultText.setText("Please Enter Number!");
        }
        else {


            int sayi1 = Integer.parseInt(number1Text.getText().toString());
            int sayi2 = Integer.parseInt(number2Text.getText().toString());
            int resultInteger = sayi1 / sayi2;

            resultText.setText("Result: " + resultInteger);
        }
    }

}
