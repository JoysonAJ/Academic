package com.example.alramexample;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

public class AlarmReciver extends BroadcastReceiver {
//AlarmReciver
    NotificationManager manager;
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        Toast.makeText(context, "Alarm is Set up", Toast.LENGTH_LONG).show();
        manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("MY Channel","Reminders",NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);
        }

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("www.google.com"));
        PendingIntent pendingIntent = PendingIntent.getActivity(context,123,i,0);

//        RingTone
        Uri ringToneUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
        MediaPlayer mediaPlayer = MediaPlayer.create(context,ringToneUri);
        mediaPlayer.start();

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,"MY Channel");
        builder.setContentTitle("My notification")
                .setContentText("Alram Notification")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)
                .setDefaults(Notification.DEFAULT_VIBRATE)
                .setSound(ringToneUri);

        manager.notify(456,builder.build());
    }
}