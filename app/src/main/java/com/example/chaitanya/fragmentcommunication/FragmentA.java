package com.example.chaitanya.fragmentcommunication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by chaitanyatanna on 3/3/16.
 */
public class FragmentA extends Fragment {

    Button button;
    int count = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragmenta, container, false);
        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.incrementCount(count);
            }
        });
        return view;
    }
}
