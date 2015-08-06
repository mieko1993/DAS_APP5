package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //When the login button is clicked
    public void onClickButtonLoginLogin(View view){
        String editText_email=((EditText)findViewById(R.id.editText_emailLogin)).getText().toString();
        String editText_password=((EditText)findViewById(R.id.editText_passwordLogin)).getText().toString();
        if (editText_email.equals("conti")&&editText_password.equals("conti")){
            Intent intent=new Intent(Login.this,Introduction.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid username or password", Toast.LENGTH_LONG).show();
        }
    }

    //When the textView Forget is clicked
    public void onClickTextViewForget(View view){
        Intent intent=new Intent(Login.this,Forgot.class);
        startActivity(intent);
    }
}