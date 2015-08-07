package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class SettingsAlarms extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_alarms);
        super.onCreateDrawer();
        //Action bar needs to be instatiate in every Activity that has layout
        setUpActionBar();
    }

    //Set up Action Bar
    private void setUpActionBar() {
        //Uses superclass method to instantiate ActionBar
        mActionBarToolbar = getActionBarToolbar();
        mActionBarToolbar.setTitle(getResources().getString(R.string.title_activity_settings_alarms));
        setSupportActionBar(mActionBarToolbar);
    }

    //when button Save is clicked
    public void onClickButtonBackSettingsAlarms(View view){
        super.onBackPressed();

    }

    public void onClickTextViewAlarmsSpeed(View view){
        Intent i=new Intent(SettingsAlarms.this,AlarmsSpeed.class);
        startActivity(i);
    }

    public void onClickTextViewAlarmsAceleration(View view){
        Intent i=new Intent(SettingsAlarms.this,AlarmsAceleration.class);
        startActivity(i);
    }

    public void onClickTextViewAlarmsFuel(View view){
        Intent i=new Intent(SettingsAlarms.this,AlarmsFuel.class);
        startActivity(i);
    }

    public void onClickTextViewAlarmsBraking(View view){
        Intent i=new Intent(SettingsAlarms.this,AlarmsBraking.class);
        startActivity(i);
    }
}
