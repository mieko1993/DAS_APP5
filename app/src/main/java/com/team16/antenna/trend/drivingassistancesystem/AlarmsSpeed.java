package com.team16.antenna.trend.drivingassistancesystem;

import android.os.Bundle;
import android.view.View;


public class AlarmsSpeed extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarms_speed);
        super.onCreateDrawer();
        //Action bar needs to be instatiate in every Activity that has layout
        setUpActionBar();
    }

    //Set up Action Bar
    private void setUpActionBar() {
        //Uses superclass method to instantiate ActionBar
        mActionBarToolbar = getActionBarToolbar();
        mActionBarToolbar.setTitle(getResources().getString(R.string.title_activity_alarms_speed));
        setSupportActionBar(mActionBarToolbar);
    }

    //when button Save is clicked
    public void onClickButtonBackSettingsAlarmsSpeed(View view){
        super.onBackPressed();

    }

}
