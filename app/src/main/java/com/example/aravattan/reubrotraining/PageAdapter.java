package com.example.aravattan.reubrotraining;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private int tabnumber;


    public PageAdapter(FragmentManager fm,int numOfTabs) {
        super(fm);
        this.tabnumber=numOfTabs;

    }

    @Override
    public Fragment getItem(int i) {


        switch(i){
            case 0: return new webviewActivity();
            case 1: return new buttonActivity();
            default: return null;
        }


    }

    @Override
    public int getCount() {
        return tabnumber;
    }


    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
