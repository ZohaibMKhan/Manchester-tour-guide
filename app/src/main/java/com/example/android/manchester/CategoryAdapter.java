package com.example.android.manchester;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by Zohaib on 10/09/2016.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PopularFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new ParksFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_popular);
            case 1:
                return mContext.getString(R.string.category_food);
            case 2:
                return mContext.getString(R.string.category_hotels);
            case 3:
                return mContext.getString(R.string.category_parks);
            default:
                return null;
        }
    }
}
