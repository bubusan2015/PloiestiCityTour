package com.example.android.ploiesticitytour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TourPageAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> fragmentsList=new ArrayList<Fragment>();
    ArrayList<String> titlesList=new ArrayList<String>();

    public TourPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return (CharSequence) titlesList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }
    public void addFragment(Fragment newFragment,String title,int category) {
        Bundle bundle=new Bundle();
        bundle.putInt("categoryType",category);
        newFragment.setArguments(bundle);
        fragmentsList.add(newFragment);
        titlesList.add(title);
    }
}
