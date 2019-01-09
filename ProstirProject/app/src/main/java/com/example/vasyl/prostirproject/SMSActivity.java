package com.example.vasyl.prostirproject;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.goodiebag.pinview.Pinview;

public class SMSActivity extends AppCompatActivity {

    private final static String PASSWORD = "0123";
    private final static String PHONENUMBER = "+380665210672";
    static TextView tw;
    static Pinview pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        pw = findViewById(R.id.pinview1);

        pw.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean b) {
                isRightPassword(pinview.getValue());
            }
        });


    }

    public void onSendMsgAfainBtnClick(View view) {
        Toast.makeText(getApplicationContext(),
                "Sending message...",
                Toast.LENGTH_SHORT)
                .show();

    }
    public  void isRightPassword (String enteredPassword){
        if (enteredPassword.equals(PASSWORD))  {

            Intent i = new Intent(this,FlowMenuActivity.class);
            startActivity(i);

        }
        else {
            tw.setText("The code is incorrect!");
            pw.setInputType(Pinview.InputType.TEXT);
            pw.setValue("");
            pw.setInputType(Pinview.InputType.NUMBER);
        }
    }
    public static boolean isRightPhone (String PhoneNumber) {
        boolean result = false;
        if (PhoneNumber.equals(PHONENUMBER)) result = true;
        return result;
    }

    public static void setPw (String code) {
        pw.setValue(code);
    }
}

