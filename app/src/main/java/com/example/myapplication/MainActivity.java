package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NextPage1(View view){
        Button button = (Button)findViewById(R.id.button1);
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void NextPage2 (View view){
        Button btn_next = (Button)findViewById(R.id.button2);
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void NextPage3 (View view){
        Button btn_next = (Button)findViewById(R.id.button3);
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}