package com.example.vasyl.prostir.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.vasyl.prostir.R;

public class DecryptedMessage extends AppCompatActivity implements View.OnClickListener {
    String codeTemp = "BLPONB - 789";
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypted_message);
        tv = findViewById(R.id.textView7);
        tv.setText(codeTemp);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button:
            {Intent i = new Intent(this, MainActivity1.class);
            startActivity(i);
            }
        }
    }
}
