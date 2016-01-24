package com.example.android.sunshine.app;

import android.app.LauncherActivity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityFragment extends Fragment {

    private String[] Data = {
            "Terça 6/23 - Sol - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    };
    private List<String> weekForecast = new ArrayList<String>(Arrays.asList(Data));
    private ArrayAdapter mForestAdapter;
    private ListView listView;
    private View rootView;

    public MainActivityFragment() {
        // Required empty public constructor

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                               Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        mForestAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast
                );

        rootView = inflater.inflate(R.layout.fragment_main, container,false);

        listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForestAdapter);

        return rootView;

    }
}
