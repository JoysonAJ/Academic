package com.example.a07_alram_menu;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

public class alaramReceiver extends BroadcastReceiver {
    Vibrator vibrator;
    NotificationManager notificationManager;

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Alarm is Set up", Toast.LENGTH_LONG).show();

//        Vibration
        vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            vibrator.vibrate(VibrationEffect.createOneShot(2000, VibrationEffect.DEFAULT_AMPLITUDE));
        else{
            vibrator.vibrate(5000);
        }

//        RingTone play
        Uri ringtoneUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        MediaPlayer mp = MediaPlayer.create(context, ringtoneUri);
        mp.start();

//        Notification
        notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("MYChannel", "Reminders", NotificationManager.IMPORTANCE_HIGH);
            notificationManager.createNotificationChannel(channel);
        }
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("www.google.com"));
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 123, i, 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "MYChannel");
        builder.setSmallIcon(android.R.drawable.alert_dark_frame)
                .setContentTitle("My notification")
                .setContentText("Alram Notification")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)
                .setDefaults(Notification.DEFAULT_VIBRATE)
                .setSound(ringtoneUri);


        notificationManager.notify(546, builder.build());
//        throw new UnsupportedOperationException("Not yet implemented");
    }
}