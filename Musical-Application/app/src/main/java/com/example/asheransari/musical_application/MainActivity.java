package com.example.asheransari.musical_application;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);

//        CatagoryAdapter catagoryAdapter = new CatagoryAdapter(this, getSupportFragmentManager());

        PagerClass pagerClass = new PagerClass(getSupportFragmentManager());

        viewPager.setAdapter(pagerClass);
    }
}
