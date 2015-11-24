package com.hecesoft.eduardo.tabbexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Eduardo on 16/11/2015.
 */
public class Page_Three extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View pageThree = inflater.inflate(R.layout.page_three, container, false);
        ((TextView)pageThree.findViewById(R.id.tv_pagethree)).setText("Welcome to page three");

        return pageThree;
    }
}
