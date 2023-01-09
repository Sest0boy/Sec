package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void backPage1(View view){
        Button btn_Next = (Button) findViewById(R.id.back01);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}