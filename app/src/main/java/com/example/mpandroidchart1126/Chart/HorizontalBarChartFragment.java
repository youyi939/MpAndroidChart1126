package com.example.mpandroidchart1126.Chart;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mpandroidchart1126.R;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HorizontalBarChartFragment extends Fragment {


    public HorizontalBarChartFragment() {
        // Required empty public constructor
    }

    private HorizontalBarChart barChart;
    private List<BarEntry> entryList ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_horizontal_bar_chart, container, false);
        barChart = view.findViewById(R.id.horizontalBarchart);

        entryList = new ArrayList<>();
        entryList.add(new BarEntry(1,23));
        entryList.add(new BarEntry(2,17));
        entryList.add(new BarEntry(3,29));
        entryList.add(new BarEntry(4,20));

        barChart.setEnabled(true);

        BarDataSet barDataSet = new BarDataSet(entryList,"成本");
        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        BarData barData = new BarData(barDataSet);
        barData.setBarWidth(0.9f);

        barChart.setData(barData);


        return view;
    }

}
