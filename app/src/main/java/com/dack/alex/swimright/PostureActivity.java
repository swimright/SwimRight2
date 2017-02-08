package com.dack.alex.swimright;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PostureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posture);
    }
    public void intentMain(View view) {
        // loads main activity
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
    public void intentRun(View view) {
        // loads main activity
        Intent intent = new Intent(this, runActivity.class);
        startActivity(intent);
    }
    public void intentStats(View view) {
        // loads main activity
        Intent intent = new Intent(this, statsActivity.class);
        startActivity(intent);
    }
}
