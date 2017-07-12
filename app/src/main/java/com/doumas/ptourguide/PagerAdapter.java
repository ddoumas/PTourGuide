package com.doumas.ptourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class    PagerAdapter extends FragmentPagerAdapter {


    private Context mContext;


    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new BuildingsFragment();
        } else {return new ChurchesFragment();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sights);
        } else if (position == 1) {
            return mContext.getString(R.string.category_museums);
        } else if (position == 2) {
            return mContext.getString(R.string.category_buildings);
        } else {
            return mContext.getString(R.string.category_churches);
        }
    }
}




