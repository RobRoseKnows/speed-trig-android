package com.example.speedtrig;

import android.app.ListActivity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;

/**
 * Created by AliAnwar7477 on 2/26/2015.
 */
public class About extends BaseActivity {

    private String[] navMenuTitles;
    private TypedArray navMenuIcons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items); // load titles from strings.xml

        navMenuIcons = getResources()
                .obtainTypedArray(R.array.nav_drawer_icons);//load icons from strings.xml

        set(navMenuTitles,navMenuIcons);
    }

    public void destroyActivity(View v){
        finish();
    }

}
