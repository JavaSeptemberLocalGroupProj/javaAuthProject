package com.example.admin.androidauth2019;

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

public class MainActivity extends AppCompatActivity {

    private final static String PASSWORD = "0123";
    private final static String PHONENUMBER = "6505551212";
    static TextView tw;
    static Pinview pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pw = findViewById(R.id.pinview1);
        tw = findViewById(R.id.errorMessageText);
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
        /*int NOTIFICATION_ID = 234;

        NotificationManager notificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {


            String CHANNEL_ID = "my_channel_01";
            CharSequence name = "my_channel";
            String Description = "This is my channel";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, importance);
            mChannel.setDescription(Description);
            mChannel.enableLights(true);
            mChannel.setLightColor(Color.RED);
            mChannel.enableVibration(true);
            mChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            mChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(mChannel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "my_channel_01")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Text")
                .setContentText("");

        Intent resultIntent = new Intent(this, MainActivity.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 0);

        builder.setContentIntent(resultPendingIntent);

        notificationManager.notify(NOTIFICATION_ID, builder.build());*/
    }
    public static void isRightPassword (String enteredPassword){
        if (enteredPassword.equals(PASSWORD)) /*System.out.println*/ {
            tw.setText("You're enter");
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
