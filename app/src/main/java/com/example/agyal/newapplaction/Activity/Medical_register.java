package com.example.agyal.newapplaction.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.agyal.newapplaction.R;

public class Medical_register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_register);
    }
    public void doc(View view){
        Intent intent=new Intent(this, Specialty.class);
        startActivity(intent);
    }
    public void center(View view){
        Intent intent=new Intent(this, Medical_centers.class);
        startActivity(intent);
    }
}
