package com.example.mpandroidchart1126.Chart;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mpandroidchart1126.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PieChartFragment extends Fragment {

    public PieChartFragment() {
        // Required empty public constructor

    }



    private PieChart pieChart;
    private List<PieEntry> entries = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pie_chart, container, false);
        pieChart = view.findViewById(R.id.pieChart);

        //添加数据
        entries.add(new PieEntry(12.0f,"未违章"));
        entries.add(new PieEntry(88.0f,"违章"));

        pieChart.setDrawHoleEnabled(true);                 //设置中心孔洞

        //设置描述内容
        String descriptionStr = "平台上有违章车辆和没违章车辆的占比统计";
        Description description = new Description();
        description.setText(descriptionStr);


        //设置图表边距，间接改变图表大小

        pieChart.setExtraLeftOffset(0f);
        pieChart.setExtraTopOffset(32f);
        pieChart.setExtraRightOffset(0f);
        pieChart.setExtraBottomOffset(32f);



        PieDataSet pieDataSet = new PieDataSet(entries,"违章情况");
        pieDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        pieDataSet.setValueLinePart1OffsetPercentage(80f);
        pieDataSet.setSliceSpace(4f);
        pieDataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);       //设置连接线在图的外侧


        PieData pieData = new PieData(pieDataSet);
        pieData.setDrawValues(true);
        pieData.setValueFormatter(new PercentFormatter());
        pieChart.setData(pieData);
        pieChart.setDescription(description);                           //设置标签


        return view;

    }

}
