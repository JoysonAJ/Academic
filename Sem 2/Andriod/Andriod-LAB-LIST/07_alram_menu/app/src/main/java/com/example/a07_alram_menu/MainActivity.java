package com.example.a07_alram_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText dateText, timeText;
    Button alarmButton;

    DatePickerDialog datePickerDialog;
    TimePickerDialog timePickerDialog;

    Calendar calendar, calendarAlram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateText = findViewById(R.id.dateInput);
        timeText = findViewById(R.id.timeInput);
        alarmButton = findViewById(R.id.alramBtn);

        calendar = Calendar.getInstance();
        calendarAlram = Calendar.getInstance();

        dateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        calendarAlram.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                        calendarAlram.set(Calendar.MONTH, month);
                        calendarAlram.set(Calendar.YEAR, year);

                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                        dateText.setText(dateFormat.format(calendarAlram.getTime()));
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        timeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int min = calendar.get(Calendar.MINUTE);

                timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        calendarAlram.set(Calendar.HOUR_OF_DAY,hourOfDay);
                        calendarAlram.set(Calendar.MINUTE,minute);

                        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm aa");

                        timeText.setText(timeFormat.format(calendarAlram.getTime()));
                    }
                }, hour, min, false);
                timePickerDialog.show();
            }
        });

        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,alaramReceiver.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(MainActivity.this,123,intent,PendingIntent.FLAG_UPDATE_CURRENT);

                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.set(AlarmManager.RTC_WAKEUP,calendarAlram.getTimeInMillis(),pendingIntent);
                Toast.makeText(MainActivity.this,"Alarm set "+calendarAlram.getTime().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

}