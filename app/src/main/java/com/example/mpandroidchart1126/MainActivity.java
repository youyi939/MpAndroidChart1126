package com.example.mpandroidchart1126;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mpandroidchart1126.Chart.BarChartFragment;
import com.example.mpandroidchart1126.Chart.HorizontalBarChartFragment;
import com.example.mpandroidchart1126.Chart.LineChartFragment;
import com.example.mpandroidchart1126.Chart.PieChartFragment;
import com.example.mpandroidchart1126.Chart.RadarChartFragment;
import com.example.mpandroidchart1126.Chart.StackingBarChartFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<Fragment> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);

        fragmentList.add(new PieChartFragment());
        fragmentList.add(new BarChartFragment());
        fragmentList.add(new LineChartFragment());
        fragmentList.add(new StackingBarChartFragment());
        fragmentList.add(new HorizontalBarChartFragment());
        fragmentList.add(new RadarChartFragment());

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }
        };

        viewPager.setAdapter(adapter);



    }
}
