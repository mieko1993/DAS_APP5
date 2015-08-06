package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class Forgot extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
    }

    //When the textView SEND is clicked
    public void onClickButtonSend(View view){
        Intent intent=new Intent(Forgot.this,Forgot2.class);
        startActivity(intent);
    }


}