package com.example.user.newaccount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EnterCodeManually extends AppCompatActivity {
    String token = "25";
    Button ok;
    EditText ed;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_code_manually);
        final String TOKEN = new String(token);
        ok = findViewById(R.id.button);
        ed = findViewById(R.id.editText);
        tv = findViewById(R.id.textView6);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = ed.getText().toString();
                if(TOKEN.equals(temp)){
                    tv.setVisibility(View.INVISIBLE);
                    gotoDecryptedMessage();
                }else{
                    tv.setVisibility(View.VISIBLE);
                    ed.setText("");
                }
            }
        });
    }

    void gotoDecryptedMessage(){
        Intent i = new Intent(this, DecryptedMessage.class);
        startActivity(i);
    }
}

