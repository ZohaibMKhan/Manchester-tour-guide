package com.example.android.manchester;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);


        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.curry_mile),
                getString(R.string.Wilmslow_road_rusholme)));
        places.add(new Place(getString(R.string.mylahore),
                getString(R.string.Wilmslow_road_rusholme)));
        places.add(new Place(getString(R.string.archies),
                getString(R.string.oxford_road_university_of_manchester)));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView list = (ListView) rootView.findViewById(R.id.list);

        list.setAdapter(placeAdapter);

        return rootView;
    }

}
