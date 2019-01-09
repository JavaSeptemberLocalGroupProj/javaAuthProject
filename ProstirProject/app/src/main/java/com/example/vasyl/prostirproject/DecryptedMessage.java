package com.example.vasyl.prostirproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DecryptedMessage extends AppCompatActivity {
    String codeTemp = "BLPONB - 789";
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypted_message);
        tv = findViewById(R.id.textView7);
        tv.setText(codeTemp);
    }
}
