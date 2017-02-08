package com.dack.alex.swimright;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class senddataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senddata);
    }

    public void intentProfile(View view) {
        // loads main profile
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
