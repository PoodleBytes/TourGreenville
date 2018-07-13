package com.udacity.poodlebytes.tourgreenville;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 *  Udacity ABND Project 5
 *  Tour App
 *
 *  07-13-2018
 *
 *  John Robitaille  aka PoodleBytes
 *
 * CREDITS/RESOURCES
 *      Images and Text copied from these websites
 *      https://vacationidea.com/destinations/best-things-to-do-in-greenville-sc.html
 *      https://www.bedandbreakfast.com
 *      https://www.google.com/maps
 *
 *     ! SPECIAL THANKS ! to fellow Udacity classmates code & tutelage:
 *      TheBailyBrew
 *      https://github.com/TheBaileyBrew/Angry_Nerds_Demo_Recycler - helped me figure out recycler on fragments
 *      Olivia Meiring
 *      https://github.com/dizzy-miss-lizzy/TourGuide - much of the logic/format used in this app
 *
 *      For expedience I did not get too fancy with menus/title bars and such.
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //open things to do fragment
        setContentView(R.layout.activity_frags);

        ViewPager viewPager = findViewById(R.id.view_pager);

        FragmentHelper adapter = new FragmentHelper(this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabMenu = findViewById(R.id.sliding_tabs);

        tabMenu.setupWithViewPager(viewPager,true);
    }
}
