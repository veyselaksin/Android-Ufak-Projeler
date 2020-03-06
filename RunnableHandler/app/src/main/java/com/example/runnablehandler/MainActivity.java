package com.example.runnablehandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int number;
    Runnable runnable;
    Handler handler;
    Button buttonstart;
    Button buttonstop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        buttonstart=findViewById(R.id.buttonstart);
        buttonstop=findViewById(R.id.buttonstop);
        number=0;

    }

    public void start(View view){

        handler =new Handler();

        runnable=new Runnable() {
            @Override
            public void run() {
                textView.setText("Time: "+number);
                number++;
                textView.setText("Time: "+number);
                handler.postDelayed(runnable,1000);
            }
        };
        handler.post(runnable);
        buttonstart.setEnabled(false);
        buttonstop.setEnabled(true);
    }

    public void stop(View view){
        buttonstart.setEnabled(true);
        buttonstop.setEnabled(false);
        handler.removeCallbacks(runnable);
    }

    public void reset(View view){
        number=0;
        textView.setText("Time: "+number);
    }
}
