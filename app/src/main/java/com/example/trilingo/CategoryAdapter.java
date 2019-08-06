package com.example.trilingo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by admin on 26-06-2016.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"NUMBERS", "RELATIONSHIPS", "WORD", "SENTENCE"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new BlankFragment();
        } else if (position == 1) {
            return new BlankFragment();
        } else if (position == 2) {
            return new BlankFragment();
        } else if (position == 3) {
            return new BlankFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}