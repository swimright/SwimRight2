package com.dack.alex.swimright;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    public void intentFAQ(View view) {
        // loads faq activity
        Intent intent = new Intent(this, faqActivity.class);
        startActivity(intent);
    }
    public void intentDoc(View view) {
        // loads main activity
        Intent intent = new Intent(this, documentationActivity.class);
        startActivity(intent);
    }
    public void intentMain(View view) {
        // loads main activity
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
