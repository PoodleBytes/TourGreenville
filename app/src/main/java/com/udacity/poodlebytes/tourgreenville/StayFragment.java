package com.udacity.poodlebytes.tourgreenville;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 *
 * populate the stay fragment
 */
public class StayFragment extends Fragment {
    Data array_of_data = new Data();    //structure of data
    ArrayList<DataSchema> WorkingData = new ArrayList<>();  //create array with data schema
    DataAdapter adapter;

    public static StayFragment newInstance() {
            StayFragment fragment = new StayFragment();
            return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        RecyclerView defaultRecycler = rootView.findViewById(R.id.default_view);

        WorkingData.clear();
        WorkingData = array_of_data.getStay();


        //Create your LinearLayoutManager with your context
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(rootView.getContext());

        //Create your adapter based on the custom class you created
        adapter = new DataAdapter(rootView.getContext(),WorkingData);

        //Set your LayoutManager and Adapter
        defaultRecycler.setLayoutManager(linearLayoutManager);
        defaultRecycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return rootView;

    }
}
