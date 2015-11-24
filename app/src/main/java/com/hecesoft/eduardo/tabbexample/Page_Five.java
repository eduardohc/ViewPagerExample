package com.hecesoft.eduardo.tabbexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Eduardo on 16/11/2015.
 */
public class Page_Five extends Fragment {

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View pageFive = inflater.inflate(R.layout.page_five, container, false);
        ((TextView)pageFive.findViewById(R.id.tv_pagefive)).setText("Welcome to page five");

        Button btn_openSignUp = (Button)pageFive.findViewById(R.id.btn_signUp);
        btn_openSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        return pageFive;
    }

    /*public void openSignUpActivity(View view){

        try {
            Intent intent = new Intent(view.getContext(), MainActivity.class);
            startActivity(intent);
        } catch (Exception e){
            e.printStackTrace();
        }

    }*/
}
