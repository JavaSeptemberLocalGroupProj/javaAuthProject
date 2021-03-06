package com.example.vasyl.prostirproject;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TypeAuthActivity extends AppCompatActivity implements View.OnClickListener {
    String usernumber="";
    Button call;
    Button sendmessage;
    Button type_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_auth);
        Bundle bundle=getIntent().getExtras();
        usernumber = bundle.getString("USER_NUMBER");
        TextView tv=(TextView)findViewById(R.id.textView);
        call=(Button)findViewById(R.id.call);
        sendmessage=(Button)findViewById(R.id.sendmessage);

        call.setOnClickListener(this);
        sendmessage.setOnClickListener(this);

        tv.setText(usernumber);
        System.out.println(usernumber);

        ActionBar actionBar = getActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.call:{

                break;
            }
            case R.id.sendmessage:{
                Intent i=new Intent(this,SMSActivity.class);
                startActivity(i);
                break;
            }
        }
    }

}
