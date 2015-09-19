package com.ergonized.cityliker.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ergonized.cityliker.R;

public class FirstFragment extends Fragment {

    private static final int LAYOUT = R.layout.fragment_first;

    private View view;

    public static FirstFragment getInstans(){
        Bundle args = new Bundle();
        FirstFragment fragment = new FirstFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
