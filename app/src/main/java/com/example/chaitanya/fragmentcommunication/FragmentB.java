package com.example.chaitanya.fragmentcommunication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by chaitanyatanna on 3/3/16.
 */
public class FragmentB extends Fragment {

    TextView textView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragmentb, container, false);

        textView = (TextView) view.findViewById(R.id.text);
        return view;
    }

    public void setTheCount(int count) {
        textView.setText("Count: " + count);
    }
}
