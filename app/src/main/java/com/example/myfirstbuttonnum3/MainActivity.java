package com.example.myfirstbuttonnum3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn;
int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
    }

    public void go(View view) {
        if (num < 5){
            num += 1;
            String str =("This is click number: "+num);
            btn.setText(str);
        }
        else if (num == 5){
            btn.setText("Enough to click, GO to new start!");
            num = 0;
        }

    }
}