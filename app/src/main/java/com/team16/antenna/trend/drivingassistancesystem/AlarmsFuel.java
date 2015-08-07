package com.team16.antenna.trend.drivingassistancesystem;

import android.os.Bundle;
import android.view.View;


public class AlarmsFuel extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarms_fuel);
        super.onCreateDrawer();
        //Action bar needs to be instatiate in every Activity that has layout
        setUpActionBar();
    }

    //Set up Action Bar
    private void setUpActionBar() {
        //Uses superclass method to instantiate ActionBar
        mActionBarToolbar = getActionBarToolbar();
        mActionBarToolbar.setTitle(getResources().getString(R.string.title_activity_alarms_fuel));
        setSupportActionBar(mActionBarToolbar);
    }

    //when button Save is clicked
    public void onClickButtonBackSettingsAlarmsFuel(View view){
        super.onBackPressed();

    }

}
