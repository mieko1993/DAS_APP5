package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class Start extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    //When the LOGIN button is clicked
    public void onClickButtonLoginStart(View view){
        Intent i=new Intent(Start.this,Login.class);
        startActivity(i);
    }

    //When the SIGNUP button is clicked
    public void onClickButtonSignUpStart(View view){
        Intent i=new Intent(Start.this,SignUp.class);
        startActivity(i);
    }
}