package com.example.fragmentsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment1 extends Fragment {
    TextView text,vers;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=
                inflater.inflate(R.layout.fragment_fragment1,container,false);
        text=(TextView) view.findViewById(R.id.AndroidApp);
        vers=(TextView) view.findViewById(R.id.Description);
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragment1, container, false);
        return view;
    }

    public void change(String txt,String txt1){
        text.setText(txt);
        vers.setText(txt1);

    }
}