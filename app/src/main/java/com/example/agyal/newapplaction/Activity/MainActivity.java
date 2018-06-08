package com.example.agyal.newapplaction.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.agyal.newapplaction.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void move(View view){
        Intent intent=new Intent(this,Medical_register.class);
        startActivity(intent);
    }
}
