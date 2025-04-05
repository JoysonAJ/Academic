package com.example.a06_text_to_speech;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final int RECOGNIZER_RESULT = 1;
    EditText inputText;
    Button readLoud, clearText;

    TextToSpeech textToSpeech;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        readLoud = findViewById(R.id.btnSpeak);
        clearText = findViewById(R.id.clearBtn);

        imageView = findViewById(R.id.imageView);

        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    textToSpeech.setLanguage(Locale.ENGLISH);
                }
            }
        });

        readLoud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = inputText.getText().toString();
                textToSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        clearText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText("");
            }
        });

//        Image View using Google reconizer

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,Locale.ENGLISH);
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT," Speak Now ");
                startActivityForResult(intent,RECOGNIZER_RESULT);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data != null && resultCode == RESULT_OK){
      /*
            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            String speechText = matches.get(0);
            inputText.setText("");
            inputText.setText(speechText);
            */

            //            or
            String speechText = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS).get(0);
            inputText.setText("");
            inputText.setText(speechText);
        }
    }
}