package com.dack.alex.swimright;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void intentSendData(View view) {
        // loads send data activity
        Intent intent = new Intent(this, senddataActivity.class);
        startActivity(intent);
    }

    public void intentMain(View view) {
        // loads main activity
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
