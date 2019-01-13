package com.example.vasyl.prostir.ui;


import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vasyl.prostir.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AcceptByCallFragment extends Fragment {
    View rootView;
    FragmentActivity main;
    TextView dot1, dot2, dot3;
    TextView[] dots;
    TextView callAgain;
    public AcceptByCallFragment() {
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
        rootView = inflater.inflate(R.layout.fragment_accept_by_call, container, false);
        dot1 = rootView.findViewById(R.id.dot1);
        dot2 = rootView.findViewById(R.id.dot2);
        dot3 = rootView.findViewById(R.id.dot3);
        dots = new TextView[] {dot1, dot2, dot3};
        callAgain = rootView.findViewById(R.id.callAgainTextView);
        for (TextView item: dots) {
            item.setVisibility(View.INVISIBLE);
        }
        new CountDownTimer((long)Double.POSITIVE_INFINITY, 1000) {
            int counter;
            @Override
            public void onTick(long millisUntilFinished) {
                if(counter == 3) {
                    counter = 0;
                    for (TextView item: dots) {
                        item.setVisibility(View.INVISIBLE);
                    }
                }
                dots[counter].setVisibility(View.VISIBLE);
                counter++;
            }
            @Override
            public void onFinish() { }
        }.start();
        callAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(main.getApplicationContext(),
                        "Recalling...", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return rootView;
    }

}
