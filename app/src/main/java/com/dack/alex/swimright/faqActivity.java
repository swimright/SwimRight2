package com.dack.alex.swimright;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class faqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
    }
    public void intentHelp(View view) {
        // loads help activity
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }
}
