package com.example.vasyl.prostir.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.vasyl.prostir.R;

public class RecallActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recall);
    }
    public void onRecallBtnClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Recalling...",
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
