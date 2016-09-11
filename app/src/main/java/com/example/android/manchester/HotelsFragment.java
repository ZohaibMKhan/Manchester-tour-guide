package com.example.android.manchester;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.hilton_hotel), getString(R.string.deansgate)));
        places.add(new Place(getString(R.string.hotel_gotham), getString(R.string.king_street)));
        places.add(new Place(getString(R.string.lowry_hotel), getString(R.string.salford)));

        ListView list = (ListView) rootView.findViewById(R.id.list);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        list.setAdapter(placeAdapter);
        return rootView;
    }

}
