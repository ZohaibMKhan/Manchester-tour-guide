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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.heaton_park), getString(R.string.prestwich)));
        places.add(new Place(getString(R.string.queens_park), getString(R.string.heaton)));
        places.add(new Place(getString(R.string.wythenshawe_park), getString(R.string.wythenshawe)));

        ListView list = (ListView) rootView.findViewById(R.id.list);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        list.setAdapter(placeAdapter);
        return rootView;
    }

}
