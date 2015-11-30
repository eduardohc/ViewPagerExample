package com.hecesoft.eduardo.tabbexample;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.app.ActionBar;
import android.view.View;
import android.view.Window;

/**
 * Created by Eduardo on 16/11/2015.
 */

public class Information_Tabs extends FragmentActivity {

    ViewPager tabViewer;
    TabPagerAdapter tabPagerAdapter;
    ActionBar actionBar;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resume_layouts);

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
                        pos = position;
                        DrawStatusPage(pos);
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

    public void DrawStatusPage(int position) {

        View circle1 = (View) findViewById(R.id.circle1);
        View circle2 = (View) findViewById(R.id.circle2);
        View circle3 = (View) findViewById(R.id.circle3);
        View circle4 = (View) findViewById(R.id.circle4);
        View circle5 = (View) findViewById(R.id.circle5);

        switch (position){
            case 0:
                circle1.setBackgroundResource(R.drawable.circle_paint);
                circle2.setBackgroundResource(R.drawable.circle);
                circle3.setBackgroundResource(R.drawable.circle);
                circle4.setBackgroundResource(R.drawable.circle);
                circle5.setBackgroundResource(R.drawable.circle);
                break;
            case 1:
                circle1.setBackgroundResource(R.drawable.circle);
                circle2.setBackgroundResource(R.drawable.circle_paint);
                circle3.setBackgroundResource(R.drawable.circle);
                circle4.setBackgroundResource(R.drawable.circle);
                circle5.setBackgroundResource(R.drawable.circle);
                break;
            case 2:
                circle1.setBackgroundResource(R.drawable.circle);
                circle2.setBackgroundResource(R.drawable.circle);
                circle3.setBackgroundResource(R.drawable.circle_paint);
                circle4.setBackgroundResource(R.drawable.circle);
                circle5.setBackgroundResource(R.drawable.circle);
                break;
            case 3:
                circle1.setBackgroundResource(R.drawable.circle);
                circle2.setBackgroundResource(R.drawable.circle);
                circle3.setBackgroundResource(R.drawable.circle);
                circle4.setBackgroundResource(R.drawable.circle_paint);
                circle5.setBackgroundResource(R.drawable.circle);
                break;
            case 4:
                circle1.setBackgroundResource(R.drawable.circle);
                circle2.setBackgroundResource(R.drawable.circle);
                circle3.setBackgroundResource(R.drawable.circle);
                circle4.setBackgroundResource(R.drawable.circle);
                circle5.setBackgroundResource(R.drawable.circle_paint);
                break;
        }
    }

    public void openSignUpActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

}
