package com.example.android.manchester;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Zohaib on 10/09/2016.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_layout, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView currentItemTitle = (TextView) listItemView.findViewById(R.id.title);

        currentItemTitle.setText(currentPlace.getName());

        TextView currentItemAddress = (TextView) listItemView.findViewById(R.id.address);

        currentItemAddress.setText(currentPlace.getAddress());

        ImageView currentImage = (ImageView) listItemView.findViewById(R.id.icon);

        if (currentPlace.hasImage()) {
            currentImage.setImageResource(currentPlace.getImageResourceId());
            currentImage.setVisibility(View.VISIBLE);
        } else {
            currentImage.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
