package com.example.storingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
        sharedPreferences =this.getSharedPreferences("com.example.storingdata", Context.MODE_PRIVATE);
        int StoredAge=sharedPreferences.getInt("StoredAge",0);

        textView.setText("Your Age: "+ StoredAge);

        if(StoredAge==0){
            textView.setText("Your Age: ");
        }
        else{
            textView.setText("Your Age: "+StoredAge);
        }
    }

    public  void save(View view){
        if(!editText.getText().toString().isEmpty()){
            int age =Integer.parseInt(editText.getText().toString());
            textView.setText("Your Age: "+age);

            sharedPreferences.edit().putInt("StoredAge",age).apply();
        }
        else{
            textView.setText("Please enter your age");
        }

    }

    public void delete(View view){
        int storedData=sharedPreferences.getInt("StoredAge",0);

        if(storedData!=0){
            sharedPreferences.edit().remove("StoredAge").apply();
            textView.setText("Your Age:");
        }
    }
}
