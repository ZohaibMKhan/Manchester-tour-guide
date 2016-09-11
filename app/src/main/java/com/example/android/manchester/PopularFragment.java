package com.example.android.manchester;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PopularFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);


        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.piccadilly_gardens),
                getString(R.string.piccadilly_gardens), R.drawable.ic_piccadilly));
        places.add(new Place(getString(R.string.old_trafford_football_stadium),
                getString(R.string.old_trafford), R.drawable.ic_old_trafford));
        places.add(new Place(getString(R.string.manchester_museum),
                getString(R.string.oxford_road), R.drawable.ic_manchester_museum));

        ListView list = (ListView) rootView.findViewById(R.id.list);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        list.setAdapter(placeAdapter);

        return rootView;
    }

}
