package com.example.fragmentsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class fragment2 extends ListFragment {
String[] AndroidApps=new String[]{
        "Saturn",
        "Astronaut",
        "Rocket",
        "Sun",
        "Stars",
        "Alien"
};

    String[] Descriptions=new String[]{
            "This is a planet that has rings",
            "This is an occupation titles for humans who go to space",
            "This is the means of transportation for going to space",
            "This is the biggest star we know",
            "These are just rocks with gas that make them twinkle",
            "These are the living being that do not belong to Earth"
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment2,container,false);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,AndroidApps);
        setListAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onListItemClick( ListView l,  View v, int position, long id) {
        fragment1 txt=(fragment1)
                getFragmentManager().findFragmentById(R.id.fragment1);
        txt.change(AndroidApps[position],"Information :"+Descriptions[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}