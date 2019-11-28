package com.example.mpandroidchart1126.Chart;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mpandroidchart1126.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BarChartFragment extends Fragment {


    public BarChartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_bar_chart, container, false);



        return view;
    }

}
