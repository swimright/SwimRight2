package com.dack.alex.swimright;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class main_menu_fragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.main_menu_fragment, container, false);
    }
            public void onClick(View view) {
                // Start the Signup activity
                Intent intent = new Intent(getActivity(), HomeActivity.class);
                startActivity(intent);
            }
}
