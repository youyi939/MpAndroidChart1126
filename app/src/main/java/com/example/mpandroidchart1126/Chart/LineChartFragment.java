package com.example.mpandroidchart1126.Chart;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mpandroidchart1126.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class LineChartFragment extends Fragment {


    public LineChartFragment() {
        // Required empty public constructor
    }

    private LineChart lineChart;
    private List<Entry> entryList ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_line_chart, container, false);
        lineChart = view.findViewById(R.id.lineChart);

        entryList = new ArrayList<>();
        entryList.add(new BarEntry(1,10));
        entryList.add(new BarEntry(2,11));
        entryList.add(new BarEntry(3,9));

        lineChart.setEnabled(false);
        lineChart.setTouchEnabled(true);


        //样式设置
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setTextSize(10f);                 //设置x轴字体大小

        Description description = new Description();                    //隐藏右下角的描述
        description.setEnabled(false);
        lineChart.setDescription(description);


        LineDataSet lineDataSet = new LineDataSet(entryList,"温度");
        lineDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        LineData lineData = new LineData(lineDataSet);
        lineChart.setData(lineData);



        return view;
    }

}
