package com.example.a12_backgroun_thread;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.AsynchronousChannelGroup;

public class MainActivity extends AppCompatActivity {
    TextView progressBar;
    ImageView imageView;
    Button DownLoadBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.tvProgress);
        imageView = findViewById(R.id.image_logo);
        DownLoadBtn = findViewById(R.id.btnDownload);

        progressBar.setVisibility(View.INVISIBLE);

        DownLoadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadImageClass imageClass = new downloadImageClass();
                imageClass.execute("https://sac-aimit.in/alogo.png");
            }
        });
    }

    class downloadImageClass extends AsyncTask<String, Integer, Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            imageView.setImageBitmap(bitmap);
            progressBar.setVisibility(View.INVISIBLE);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressBar.setText("Download" + values[0] + "%");
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            Bitmap bmp = null;
            try {
                URL imageURL = new URL(strings[0]);
                publishProgress(25);

                HttpURLConnection connection = (HttpURLConnection) imageURL.openConnection();
                publishProgress(50);

                InputStream inputStream = connection.getInputStream();
                publishProgress(75);

                bmp = BitmapFactory.decodeStream(inputStream);
                publishProgress(100);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bmp;
        }
    }
}