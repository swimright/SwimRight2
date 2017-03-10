package com.dack.alex.swimright;

import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.os.Handler;
import android.widget.LinearLayout;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.Viewport;

public class GraphActivity extends AppCompatActivity implements SensorEventListener {
    //sensor data
    private TextView xText, yText, zText;
    private Sensor mySensor;
    private SensorManager SM;
    int graphcount = 0;

    private LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        //create our Sensor Manager
        //SM = (SensorManager)getSystemService(SENSOR_SERVICE);
        SM = (SensorManager)getSystemService(Context.SENSOR_SERVICE);

        //Accelerometer Sensor
        mySensor = SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //Register Sensor -Listener
        SM.registerListener(this,mySensor,SensorManager.SENSOR_DELAY_NORMAL);

        // Assign TextView
        xText = (TextView)findViewById(R.id.xText);
        yText = (TextView)findViewById(R.id.yText);
        zText = (TextView)findViewById(R.id.zText);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        xText.setText("X " + event.values[0]);
        yText.setText("Y " + event.values[1]);
        zText.setText("Z " + event.values[2]);
        graphcount++;

        //get graph view instance
        GraphView graph = (GraphView)findViewById(R.id.graph);

        //data
        DataPoint[] points = new DataPoint[10];
        for (int i=0; i<10; i++) {
            DataPoint v = new DataPoint(event.values[0], event.values[1]);
            points[i] = v;
        }

        series = new LineGraphSeries<DataPoint>(points);
        graph.addSeries(series);

        Viewport viewport = graph.getViewport();

        viewport.setYAxisBoundsManual(true);
        viewport.setMinY(-10);
        viewport.setMaxY(10);

        viewport.setXAxisBoundsManual(true);
        viewport.setMinX(0);
        viewport.setMaxX(10);

        //setting size of graph - x
        //graph.getViewport().setXAxisBoundsManual(true);
        //graph.getViewport().setMinX(0);
        //graph.getViewport().setMaxX(10);


        //setting size of graph - y
        //graph.getViewport().setYAxisBoundsManual(true);
        //graph.getViewport().setMinY(-10);
        //graph.getViewport().setMaxY(10);

        //GraphView
        //LineGraphSeries<DataPoint> series = new  LineGraphSeries<>(new DataPoint[] {
        //       new DataPoint(1,1)
        //});

        //if(graphcount < 10) {
          //  series.appendData(new DataPoint(graphcount, graphcount), true, 10);
        //}
        //graph.addSeries(series);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        //Not in use
    }

    public void intentMain(View view) {
        // loads main activity
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
