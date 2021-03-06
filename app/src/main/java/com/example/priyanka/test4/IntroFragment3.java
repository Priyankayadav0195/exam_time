package com.example.priyanka.test4;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class IntroFragment3 extends Fragment {
    TextView mainStart,text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_intro_fragment3, container, false);
        mainStart = (TextView) v.findViewById(R.id.MainStart);

        text = (TextView) v.findViewById(R.id.text);

        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/raleway.ttf");
        text.setTypeface(tf);

        mainStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getActivity().overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
                getActivity().finish();
            }
        });

        return v;
    }



}
