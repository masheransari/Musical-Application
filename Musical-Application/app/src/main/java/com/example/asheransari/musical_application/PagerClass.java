package com.example.asheransari.musical_application;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by asher.ansari on 10/3/2016.
 */
public class PagerClass extends FragmentPagerAdapter{

    public PagerClass(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position)
    {
        if (position==0)
        {
            return new playing_list();
        }
        else if (position==1)
        {
            return new current_playing();
        }
        else
        {
            return null;
        }
    }
    @Override
    public int getCount()
    {
        return 2;
    }
}
