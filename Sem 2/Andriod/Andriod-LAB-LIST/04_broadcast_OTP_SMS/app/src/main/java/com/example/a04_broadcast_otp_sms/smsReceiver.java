package com.example.a04_broadcast_otp_sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.widget.EditText;
import android.widget.Toast;

public class smsReceiver extends BroadcastReceiver {
    private static EditText editOTP;

    @Override
    public void onReceive(Context context, Intent intent) {

        SmsMessage[] messages = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        for(SmsMessage smsMessage:messages){
            String smsText = smsMessage.getMessageBody();
            String getOtp = smsText.split(":")[1];
            editOTP.setText(getOtp);
        }
    }

    public void setOTPEdit(EditText otpView) {
        smsReceiver.editOTP = otpView;
    }
}