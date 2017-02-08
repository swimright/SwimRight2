package com.dack.alex.swimright;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class distActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dist);
    }
    public void intentStats(View view) {
        // loads stats activity
        Intent intent = new Intent(this, statsActivity.class);
        startActivity(intent);
    }
}
