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
public class PopularFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        /* TODO: Create data structure, add items to list, append to adapter, set adapter to listview */
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Piccadilly Gardens", "Piccadilly Gardens", R.drawable.ic_piccadilly));
        places.add(new Place("Old Trafford Football Stadium", "Old Trafford", R.drawable.ic_old_trafford));
        places.add(new Place("Manchester Museum", "Oxford Road", R.drawable.ic_manchester_museum));

        ListView list = (ListView) rootView.findViewById(R.id.list);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        list.setAdapter(placeAdapter);

        return rootView;
    }

}
