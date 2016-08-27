package com.example.priyanka.test4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import java.util.HashMap;

/**
 * Created by Sameer1 on 01-08-2016.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {
    int count = 3;



    public MyPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                Fragment fm1 = new IntroFragment1();
                return fm1;
            case 1:
                Fragment fm2 = new IntroFragment2();
                return fm2;
            default:
                Fragment fm3 = new IntroFragment3();
                return fm3;
        }
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "CREDIT";
                break;
            case 1:
                title = "DEBIT";
                break;
            case 2:
                title = "BALANCE";
                break;
        }
        return title;
    }

}
