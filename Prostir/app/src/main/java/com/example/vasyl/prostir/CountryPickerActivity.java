package com.example.vasyl.prostir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rilixtech.CountryCodePicker;

public class CountryPickerActivity extends AppCompatActivity implements View.OnClickListener {
    CountryCodePicker ccp;
    Button next;
    String codePhone;
    String num;
    TextView number;
    String usernumber="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_picker);
        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        next=(Button)findViewById(R.id.country_next);
        number=findViewById(R.id.number);
        next.setOnClickListener(this);



    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), TypeAuthActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }


    public void getNumber(){
        codePhone=ccp.getSelectedCountryCodeWithPlus();
        usernumber=codePhone;
        System.out.println("nnub1 "+usernumber);
        num=number.getText().toString();
        System.out.println("nu2 "+num);
        usernumber=usernumber+num;
        System.out.println("nnub3 "+usernumber);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.country_next:{
                getNumber();
                Intent i=new Intent(this,TypeAuthActivity.class);
                i.putExtra("USER_NUMBER",usernumber);
                startActivity(i);
                break;
            }
        }
    }
}
