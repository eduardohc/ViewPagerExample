package com.hecesoft.eduardo.tabbexample;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by Eduardo on 17/11/2015.
 */
public class Initial_activity extends Activity {

    Animation animation;
    TextView title;
    TextView subtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set activity fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.initial_activity);

        title = (TextView) findViewById(R.id.tv_title);
        subtitle = (TextView) findViewById(R.id.tv_subtitle);

        Typeface typeface_title = Typeface.createFromAsset(
                getAssets(), "fonts/Snell_Roundhand_Bold.ttf");
        title.setTypeface(typeface_title);

        animation = AnimationUtils.loadAnimation(this, R.anim.donnfor_subtitle);
        subtitle.startAnimation(animation);


        //Sleep activity for 3 seconds
        Thread timer = new Thread(){
            public void run() {
                try{
                    sleep(5000);
                }catch (Exception e){
                    e.printStackTrace();
                } finally {
                    openInformationTabs();
                }
            }
        };

        timer.start();
    }

    public void openInformationTabs(){
        Intent intent = new Intent(this, Information_Tabs.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        System.exit(1);
    }
}
