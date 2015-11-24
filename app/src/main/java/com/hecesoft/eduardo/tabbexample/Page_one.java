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
public class Page_one extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View pageOne = inflater.inflate(R.layout.page_one, container, false);
        ((TextView)pageOne.findViewById(R.id.tv_pageone)).setText("Welcome to page one");

        return pageOne;
    }
}
