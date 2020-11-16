package com.example.esercitazione3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PieChartView pieChart = this.findViewById(R.id.piechart);

        Float[] percent = new Float[] {40.0f, 20.0f, 20.0f, 20.0f};
        Integer[] color = new Integer[] {0xffedf8fb, 0xffb2e2e2, 0xff66c2a, 0xff66c2a4};

        pieChart.setPercent(Arrays.asList(percent));
        pieChart.setSegmentColor(Arrays.asList(color));

        pieChart.setRadius(300);
        pieChart.setStrokeColor(Color.BLACK);
        pieChart.setStrokeWidth(4);

    }
}