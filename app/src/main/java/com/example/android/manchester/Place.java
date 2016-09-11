package com.example.android.manchester;

import android.widget.ImageView;

/**
 * Created by Zohaib on 10/09/2016.
 */
public class Place {

    private String name;
    private String address;
    private int imageResourceId = NO_IMAGE_SET;
    private static final int NO_IMAGE_SET = -1;

    public Place(String nameResourceId, String addressResourceId, int imageResourceId) {
        this.name = nameResourceId;
        this.address = addressResourceId;
        this.imageResourceId = imageResourceId;
    }

    public Place(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_SET;
    }


}
