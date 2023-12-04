package com.example.campusrecuitment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        // Initialize CalendarView
        CalendarView calendarView = findViewById(R.id.calendarView);

        // Set a listener to handle date changes
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // Handle the selected date change
                // You can perform actions based on the selected date
            }
        });
    }
}