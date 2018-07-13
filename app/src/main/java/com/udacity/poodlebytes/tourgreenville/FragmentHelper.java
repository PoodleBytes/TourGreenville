package com.udacity.poodlebytes.tourgreenville;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentHelper extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentHelper(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0: //Create Fragment Views based on display
                return new ToDoFragment();
            case 1:
                return new EatFragment();
            case 2:
                return new StayFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.todo);
            case 1:
                return com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.stay);
            case 2:
                return com.udacity.poodlebytes.tourgreenville.App.getContext().getResources().getString(R.string.eat);
            default:
                return null;
        }
    }
}