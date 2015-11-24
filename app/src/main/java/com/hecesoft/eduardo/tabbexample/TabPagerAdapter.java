package com.hecesoft.eduardo.tabbexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Eduardo on 16/11/2015.
 */
public class TabPagerAdapter extends FragmentStatePagerAdapter {

    public TabPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Page_one();
            case 1:
                return new Page_Two();
            case 2:
                return new Page_Three();
            case 3:
                return new Page_Four();
            case 4:
                return new Page_Five();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
