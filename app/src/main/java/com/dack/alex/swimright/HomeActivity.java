package com.dack.alex.swimright;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class HomeActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.dack.alex.swimright.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void intentProfile(View view) {
        // Loads profile activity
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void intentPosture(View view) {
        // loads posture activity
        Intent intent = new Intent(this, PostureActivity.class);
        startActivity(intent);
    }

    public void intentHelp(View view) {
        // loads help activity
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }

    public void intentGraph(View view) {
        // loads graph activity
        Intent intent = new Intent(this, GraphActivity.class);
        startActivity(intent);
    }


}
