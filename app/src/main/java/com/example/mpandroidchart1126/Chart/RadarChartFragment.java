package com.example.mpandroidchart1126.Chart;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mpandroidchart1126.R;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RadarChartFragment extends Fragment {


    public RadarChartFragment() {
        // Required empty public constructor
    }

    private RadarChart radarChart;
    private List<RadarEntry> entryList;
    private List<String> xdata;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_radar_chart, container, false);
        radarChart = view.findViewById(R.id.radarChart);
        entryList = new ArrayList<>();
        xdata = new ArrayList<>();
        xdata.add("1");
        xdata.add("2");
        xdata.add("3");
        xdata.add("4");
        xdata.add("5");

        //设置显示标签
        XAxis xAxis = radarChart.getXAxis();
        xAxis.setTextSize(20f);
        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return xdata.get((int)value % xdata.size());
            }
        });

        //设置雷达图中心为0
        YAxis yAxis = radarChart.getYAxis();
        yAxis.setLabelCount(5,true);
        yAxis.setAxisMinimum(0f);
        yAxis.setDrawTopYLabelEntry(false);
        yAxis.setTextSize(15f);

        radarChart.setDrawWeb(true);
        radarChart.setEnabled(false);

        entryList.add(new RadarEntry(12));
        entryList.add(new RadarEntry(9));
        entryList.add(new RadarEntry(11));
        entryList.add(new RadarEntry(16));
        entryList.add(new RadarEntry(10));

        RadarDataSet radarDataSet = new RadarDataSet(entryList,"研发成本");
        radarDataSet.setDrawValues(false);
        radarDataSet.setColors(ColorTemplate.JOYFUL_COLORS);

        RadarData radarData = new RadarData(radarDataSet);
        radarChart.setData(radarData);

        return view;
    }

}
