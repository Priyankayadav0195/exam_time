package com.example.priyanka.test4;

import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.priyanka.test4.R;


public class IntroFragment1 extends Fragment {
TextView text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_intro_fragment1, container, false);
        text = (TextView) v.findViewById(R.id.text);

        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(),"fonts/raleway.ttf");
        text.setTypeface(tf);


        return v;
    }


}
