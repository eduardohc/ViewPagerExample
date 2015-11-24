package com.hecesoft.eduardo.tabbexample;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.app.ActionBar;
import android.view.Window;

/**
 * Created by Eduardo on 16/11/2015.
 */

public class Information_Tabs extends FragmentActivity {

    ViewPager tabViewer;
    TabPagerAdapter tabPagerAdapter;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_activity);

        try {
            tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());

            tabViewer = (ViewPager) findViewById(R.id.pager);

                tabViewer.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {
                        actionBar = getActionBar();
                        try {
                            actionBar.setSelectedNavigationItem(position);
                        } catch (Exception exeption){
                            exeption.printStackTrace();
                        }
                    }
                });


            tabViewer.setAdapter(tabPagerAdapter);

            actionBar = getActionBar();
            // Enable tabs on Action Bar
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
            ActionBar.TabListener tabListener = new ActionBar.TabListener() {
                @Override
                public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                    tabViewer.setCurrentItem(tab.getPosition());
                }

                @Override
                public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

                }

                @Override
                public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

                }
            };

        actionBar.addTab(actionBar.newTab().setText("").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("").setTabListener(tabListener));

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
