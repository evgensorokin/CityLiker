package com.ergonized.cityliker.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ergonized.cityliker.fragment.FirstFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm){
        super(fm);

        tabs = new String[]{
                "Новости",
                "Мой кабинет",
                "Погода"
        };
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FirstFragment.getInstans();
            case 1:
                return FirstFragment.getInstans();
            case 2:
                return FirstFragment.getInstans();
            case 3:
                return FirstFragment.getInstans();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
