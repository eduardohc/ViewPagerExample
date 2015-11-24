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
public class Page_Two extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View pageTwo = inflater.inflate(R.layout.page_two, container, false);
        ((TextView)pageTwo.findViewById(R.id.tv_pagetwo)).setText("Welcome to page two");

        return pageTwo;
    }
}
