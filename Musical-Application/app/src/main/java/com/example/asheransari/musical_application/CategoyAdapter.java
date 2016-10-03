package com.example.asheransari.musical_application;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by asher.ansari on 10/2/2016.
 */
public class CategoyAdapter extends FragmentPagerAdapter{

    private Context mContext;

    public CategoyAdapter(Context cOntext,FragmentManager fm) {

        super(fm);
        mContext = cOntext;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new currentPlaying();
        } else {
            return new playing();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.list);
        } else{
            return mContext.getString(R.string.playing);
        }
    }
}
