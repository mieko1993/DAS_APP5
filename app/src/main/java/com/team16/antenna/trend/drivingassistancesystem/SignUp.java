package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class SignUp extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    //IF buttons
    public void onClickCheckboxSignup(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkboxSignup:
                if (checked) {
                    Button done = (Button) findViewById(R.id.button_doneSignup);
                    done.setEnabled(true);
                }
                else{
                    Button done = (Button) findViewById(R.id.button_doneSignup);
                    done.setEnabled(false);
                }
                break;
        }

    }

    //when button DONE is clicked
    public void onClickButtonDone(View view){
        Intent i=new Intent(SignUp.this,Login.class);
        startActivity(i);
    }

    //When the textView terms is clicked
    public void onClickTextViewTerms(View view){
        Intent intent=new Intent(SignUp.this,Terms.class);
        startActivity(intent);
    }
}