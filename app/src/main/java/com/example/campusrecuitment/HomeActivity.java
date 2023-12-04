package com.example.campusrecuitment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    // Move the onButtonClick method outside the onCreate method
    public void onButtonClick(View view) {
        // Handle button clicks based on the button ID
        switch (view.getId()) {
            case R.id.btn1:
                // Replace 'profile' with the actual class you want to navigate to
                Intent profileIntent = new Intent(this, profile.class);
                startActivity(profileIntent);
                break;

            case R.id.btn2:
                // Replace 'profile' with the actual class you want to navigate to
                Intent scheduleIntent = new Intent(this, schedule.class);
                startActivity(scheduleIntent);
                break;

            case R.id.btn3:
                // Replace 'profile' with the actual class you want to navigate to
                Intent announcementIntent = new Intent(this, announcement.class);
                startActivity(announcementIntent);
                break;

            case R.id.btn4:
                // Replace 'profile' with the actual class you want to navigate to
                Intent tipsIntent = new Intent(this, tips.class);
                startActivity(tipsIntent);
                break;

            case R.id.btn5:
                // Replace 'profile' with the actual class you want to navigate to
                Intent recuitmentIntent = new Intent(this, recuitment.class);
                startActivity(recuitmentIntent);
                break;


            case R.id.btn6:
                // Replace 'profile' with the actual class you want to navigate to
                Intent SkillTestIntent = new Intent(this, SkillTest.class);
                startActivity(SkillTestIntent);
                break;

            case R.id.btn7:
                // Replace 'profile' with the actual class you want to navigate to
                Intent learningIntent = new Intent(this, learning.class);
                startActivity(learningIntent);
                break;

            case R.id.btn8:
                // Replace 'profile' with the actual class you want to navigate to
                Intent aboutIntent = new Intent(this, about.class);
                startActivity(aboutIntent);
                break;

            // Add cases for other buttons as needed

            default:
                // Handle unexpected clicks
                Toast.makeText(this, "Unexpected click", Toast.LENGTH_SHORT).show();
        }
    }
}
