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
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class BarChartFragment extends Fragment {


    public BarChartFragment() {
        // Required empty public constructor
    }

    private BarChart barChart;
    private List<BarEntry> entryList1 ;
    private List<BarEntry> entryList2 ;
    private List<BarEntry> entryList3 ;
    private List<IBarDataSet> dataSetList ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_bar_chart, container, false);
        barChart = view.findViewById(R.id.barChart);

        entryList1 = new ArrayList<>();
        entryList2 = new ArrayList<>();
        entryList3 = new ArrayList<>();
        dataSetList = new ArrayList<>();

        //表数据
        entryList1.add(new BarEntry(0f,1000f));
        entryList1.add(new BarEntry(3f,1100f));
        entryList1.add(new BarEntry(6f,9000f));

        entryList2.add(new BarEntry(1f,2000f));
        entryList2.add(new BarEntry(4f,15000f));
        entryList2.add(new BarEntry(7f,10500f));

        entryList3.add(new BarEntry(2f,1000f));
        entryList3.add(new BarEntry(5f,10900f));
        entryList3.add(new BarEntry(8f,19000f));

        BarDataSet barDataSet = new BarDataSet(entryList1,"保养支出");
        BarDataSet barDataSet2 = new BarDataSet(entryList2,"维修支出");
        BarDataSet barDataSet3 = new BarDataSet(entryList3,"保险支出");

        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        barDataSet2.setColors(ColorTemplate.JOYFUL_COLORS);
        barDataSet3.setColors(ColorTemplate.JOYFUL_COLORS);

        dataSetList.add(barDataSet);
        dataSetList.add(barDataSet2);
        dataSetList.add(barDataSet3);

        BarData barData = new BarData(dataSetList);
        barData.setBarWidth(0.9f);          //设置柱体宽度，这样柱与柱之间间隔就是0.1

        barChart.setData(barData);
        barChart.setFitBars(true);
        barChart.invalidate();              //刷新


        return view;
    }

}
