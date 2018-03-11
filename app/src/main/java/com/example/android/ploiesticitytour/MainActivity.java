package com.example.android.ploiesticitytour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // reviewer question
        // dar si pentru mentor
        // e mai bine sa salvez practic fragmentele asa..... adica mai are vreun beneficiu fragmentStatePageAdapter
        // sau e bine sa creez un fragment nou ori decate ori e nevoie din interiorul...
        // intrebarea altfel spus pot salva fragmentele intr-o lista arrayList definita in cadrul fragmentStatePageAdapter sau e bine sa le instantiez cu new la getView?
        ViewPager myViewPager=findViewById(R.id.main_viewPager);
        TabLayout myTabLayout=findViewById(R.id.main_tab_layout);
        TourPageAdapter myTourPageAdapter=new TourPageAdapter(getSupportFragmentManager());
        myTourPageAdapter.addFragment(new LocationCategoryFragment(),getString(R.string.hotels),1);
        myTourPageAdapter.addFragment(new LocationCategoryFragment(),getString(R.string.restaurants),2);
        myTourPageAdapter.addFragment(new LocationCategoryFragment(),getString(R.string.museums),3);
        myTourPageAdapter.addFragment(new LocationCategoryFragment(),getString(R.string.attractions),4);
        myTourPageAdapter.addFragment(new AboutFragment(),getString(R.string.about_ploiesti),0);

        myViewPager.setAdapter(myTourPageAdapter);
        myTabLayout.setupWithViewPager(myViewPager);

    }
}