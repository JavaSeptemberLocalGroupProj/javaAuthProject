package com.example.admin.androidauth2019;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;

public class SMSReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        SmsMessage sm = Telephony.Sms.Intents.getMessagesFromIntent(intent)[0];
        String sp = sm.getOriginatingAddress();
        if (MainActivity.isRightPhone(sp)) {
            String message = sm.getMessageBody();
            String code = "";
            System.out.println(sp);
            for (char item : message.toCharArray()) {
                if (Character.isDigit(item)) {
                    code += item;
                }
            }
            if (code.length() == 4)
            {
                System.out.println(code);
                MainActivity.isRightPassword(code);
                MainActivity.setPw(code);
            }
        }
    }
}