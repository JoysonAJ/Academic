package com.example.a03_music_player;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class MyMusic extends Service {
    MediaPlayer mediaPlayer;
    public MyMusic() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
//        mediaPlayer = MediaPlayer.create(this,R.raw.music);
//        if don't have music audio then choose the default ringtone
        mediaPlayer =MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}