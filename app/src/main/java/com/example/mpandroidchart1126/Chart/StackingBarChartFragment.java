package com.example.mpandroidchart1126.Chart;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mpandroidchart1126.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class StackingBarChartFragment extends Fragment {


    public StackingBarChartFragment() {
        // Required empty public constructor
    }

    private BarChart barChart;
    private List<BarEntry> entryList ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stacking_bar_chart, container, false);
        barChart = view.findViewById(R.id.stackingBarChart);

        entryList = new ArrayList<>();
        entryList.add(new BarEntry(1,new float[]{123,456}));
        entryList.add(new BarEntry(2,new float[]{99,228}));
        entryList.add(new BarEntry(3,new float[]{150,396}));

        BarDataSet barDataSet = new BarDataSet(entryList,"京东");
        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);

        barChart.setDrawValueAboveBar(false);
        barChart.setEnabled(true);

        BarData barData = new BarData(barDataSet);
        barData.setBarWidth(0.9f);          //设置柱体宽度，这样柱与柱之间间隔就是0.1

        barChart.setData(barData);

        return view;
    }

}
