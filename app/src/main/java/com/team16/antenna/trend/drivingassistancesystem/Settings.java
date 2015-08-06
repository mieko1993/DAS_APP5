package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;


public class Settings extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        super.onCreateDrawer();
        //Action bar needs to be instatiate in every Activity that has layout
        setUpActionBar();

    }



    //Set up Action Bar
    private void setUpActionBar() {
        //Uses superclass method to instantiate ActionBar
        mActionBarToolbar = getActionBarToolbar();
        mActionBarToolbar.setTitle(getResources().getString(R.string.action_settings));
        setSupportActionBar(mActionBarToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //Set up Icon for the Navigation Drawer
        mActionBarToolbar.setNavigationIcon(R.drawable.ic_drawer);
        //Set up Action for the Navigation Drawer Icon
        mActionBarToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerList.isShown()) {
                    //Close Navigation Drawer
                    drawerLayout.closeDrawer(Gravity.LEFT);
                } else {
                    //Open Navigation Drawer
                    drawerLayout.openDrawer(Gravity.LEFT);
                }
            }
        });

    }

    //when button Save is clicked
    public void onClickButtonSaveSettings(View view){
        super.onBackPressed();

    }

    //when Car Data is clicked
    public void onClickTextViewCarData(View view){
        Intent intent=new Intent(Settings.this,SettingsCarData.class);
        startActivity(intent);
    }
    //when Alarm is clicked
    public void onClickTextViewAlarms(View view){
        Intent intent=new Intent(Settings.this,SettingsAlarms.class);
        startActivity(intent);
    }

    //when Notifications is clicked
    public void onClickTextViewNotifications(View view){
        Intent intent=new Intent(Settings.this,SettingsNotifications.class);
        startActivity(intent);
    }

    //when Languages is clicked
    public void onClickTextViewLanguages(View view){
        Intent intent=new Intent(Settings.this,SettingsLanguajes.class);
        startActivity(intent);
    }

    //when Units is clicked
    public void onClickTextViewUnits(View view){
        Intent intent=new Intent(Settings.this,SettingsUnits.class);
        startActivity(intent);
    }


}