package com.dack.alex.swimright;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class runActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);
    }
    public void intentPosture(View view) {
        // loads posture activity
        Intent intent = new Intent(this, PostureActivity.class);
        startActivity(intent);
    }
}
