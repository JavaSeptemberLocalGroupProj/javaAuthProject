package com.example.vasyl.prostir.ui;


import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.vasyl.prostir.R;


public class SelectAuthTypeFragment extends Fragment {
    View rootView;
    FragmentActivity main;
     String userPhoneNumber;
     Button acceptByCallBtn;
     Button acceptBySMSlBtn;
    public SelectAuthTypeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        main = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_select_auth_type, container, false);
        Bundle bundle = main.getIntent().getExtras();
        // COMMUNICATION PART
 //       userPhoneNumber = bundle.getString("USER_NUMBER");
 //       acceptByCallBtn = rootView.findViewById(R.id.acceptByCallBtn);
        /////////////////////
        acceptBySMSlBtn = rootView.findViewById(R.id.acceptBySMSlBtn);
        acceptByCallBtn = rootView.findViewById(R.id.acceptByCallBtn);
        acceptBySMSlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrameLayout fl = rootView.findViewById(R.id.authTypeLayout);
                FragmentManager fm = getChildFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction().replace(R.id.authTypeLayout, new AcceptBySmsFragment())
                        .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                fl.removeAllViewsInLayout();
                transaction.commit();
            }
        });
        acceptByCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrameLayout fl = rootView.findViewById(R.id.authTypeLayout);
                FragmentManager fm = getChildFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction().replace(R.id.authTypeLayout, new AcceptByCallFragment())
                        .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                fl.removeAllViewsInLayout();
                transaction.commit();
            }
        });
        ActionBar actionBar = main.getActionBar();
        ((AppCompatActivity)main).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity)main).getSupportActionBar().setDisplayShowHomeEnabled(true);

        return rootView;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            main.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
