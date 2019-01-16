package com.example.admin.smslistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;

public class SMSReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("Hello World!!!!!!");
        SmsMessage sm = Telephony.Sms.Intents.getMessagesFromIntent(intent)[0];
        System.out.println("Yess: " + sm.getMessageBody());

    }
}